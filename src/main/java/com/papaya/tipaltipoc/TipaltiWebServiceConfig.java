package com.papaya.tipaltipoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class TipaltiWebServiceConfig {
    @Bean
    public Jaxb2Marshaller payeeMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.papaya.tipaltipoc.generated.payer");
        return marshaller;
    }

    @Bean
    public TipaltiPayeeClient tipaltiPayeeClient(Jaxb2Marshaller marshaller) {
        TipaltiPayeeClient client = new TipaltiPayeeClient();
        client.setDefaultUri("https://api.sandbox.tipalti.com/v9/PayeeFunctions.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Bean
    public TipaltiPayerClient tipaltiPayerClient(Jaxb2Marshaller marshaller) {
        TipaltiPayerClient client = new TipaltiPayerClient();
        client.setDefaultUri("https://api.sandbox.tipalti.com/v9/PayerFunctions.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
