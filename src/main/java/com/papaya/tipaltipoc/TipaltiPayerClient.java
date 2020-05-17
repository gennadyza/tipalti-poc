package com.papaya.tipaltipoc;

import com.papaya.tipaltipoc.generated.payer.GetBalances;
import com.papaya.tipaltipoc.generated.payer.GetBalancesResponse;
import com.papaya.tipaltipoc.generated.payer.GetPayerEntities;
import com.papaya.tipaltipoc.generated.payer.GetPayerEntitiesResponse;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.bind.JAXBElement;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class TipaltiPayerClient extends WebServiceGatewaySupport {
    //public GetPayerEntitiesResponse getBank(String url, Object request)
    public GetPayerEntitiesResponse getPayerEntities(Object request){
        GetPayerEntities payerEntities = new GetPayerEntities();
        payerEntities.setPayerName("Papaya");
        payerEntities.setKey("key");
        payerEntities.setTimestamp((double) LocalDateTime.now(ZoneOffset.UTC).toEpochSecond(ZoneOffset.UTC));

        GetPayerEntitiesResponse response =(GetPayerEntitiesResponse) getWebServiceTemplate()
                //.marshalSendAndReceive(uri, request);
                .marshalSendAndReceive(request);
        return response;
    }

    public GetBalancesResponse getBalances(){
        GetBalances request = new GetBalances();
        //request.setPayerName("Papaya");
        request.setPayerName("PapayaGlobal");
        //request.setKey("0kbVc9aDj9OfemxXYbKX1NVxa3qke2O4mzMgmVCIAivmrWRR/EwV2XMh2IpfzTjl");
        request.setKey(Hmacsha256.getEncryptionKey());
        request.setTimestamp((double) LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
        GetBalancesResponse response = (GetBalancesResponse) getWebServiceTemplate().marshalSendAndReceive(request, new WebServiceMessageCallback() {

            public void doWithMessage(WebServiceMessage message) {
                ((SoapMessage)message).setSoapAction("http://Tipalti.org/GetBalances");
            }});
        return response;
    }
}
