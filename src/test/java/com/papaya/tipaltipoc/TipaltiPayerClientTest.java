package com.papaya.tipaltipoc;

import com.papaya.tipaltipoc.generated.payer.GetBalancesResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TipaltiPayerClientTest {
    @Autowired
    TipaltiPayerClient tipaltiPayerClient;
    @Test
    void getBalancesTest(){
        GetBalancesResponse balances = tipaltiPayerClient.getBalances();
        System.out.println(balances.toString());
    }
}
