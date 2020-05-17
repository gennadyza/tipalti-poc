package com.papaya.tipaltipoc;

import lombok.SneakyThrows;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Base64;

public class Hmacsha256 {
    @SneakyThrows
    public static String getEncryptionKey() {
        String stringMessage = "Papaya" + LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        //stringMessage = stringMessage.substring(0, stringMessage.length()-3);
        byte[] secretKey = "uGSxuE3LpTbY76b2gfPLrs2BDEs5ba8qjrUhU5iP2PWIp1IoWPI8+41CuSq65sXx".getBytes(StandardCharsets.UTF_8);
        byte[] message = stringMessage.getBytes(StandardCharsets.UTF_8);
        byte[] hmacSha256 = null;

        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey, "HmacSHA256");
        mac.init(secretKeySpec);
        hmacSha256 = mac.doFinal(message);
        String base64HmacSha256 = Base64.getEncoder().encodeToString(hmacSha256);
        //String base64HmacSha256 = String.format("%032x", new BigInteger(1, hmacSha256));
        return base64HmacSha256;
        //return hexencode(hmacSha256);

    }

    public static String hexencode(byte[] bytes){
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes){
            sb.append(String.format("%02x",b));
        }
        return sb.toString();
    }
}
