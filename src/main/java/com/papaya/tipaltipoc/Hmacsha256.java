package com.papaya.tipaltipoc;

import lombok.SneakyThrows;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Base64;

public class Hmacsha256 {
    @SneakyThrows
    public static String getEncryptionKey() {
        String stringMessage = "Papaya999" + LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli();
        stringMessage = stringMessage.substring(0, stringMessage.length()-3);
        byte[] secretKey = "uGSxuE3LpTbY76b2gfPLrs2BDEs5ba8qjrUhU5iP2PWIp1IoWPI8+41CuSq65sXx".getBytes(StandardCharsets.UTF_8);
        byte[] message = stringMessage.getBytes(StandardCharsets.UTF_8);
        byte[] hmacSha256 = null;

        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey, "HmacSHA256");
        mac.init(secretKeySpec);
        hmacSha256 = mac.doFinal(message);
        String base64HmacSha256 = Base64.getEncoder().encodeToString(hmacSha256);
        return base64HmacSha256;
    }
}
