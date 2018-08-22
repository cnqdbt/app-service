package com.juhaolian.appservice.utils;

import org.bouncycastle.util.encoders.Hex;

import java.security.MessageDigest;
import java.util.Random;
import java.util.UUID;

/**
 * Created by bite on 18-8-22.
 */
public class AppkeyGenerator {
    public static String generateAppkey() {
        UUID uuid = UUID.randomUUID();
        String appkey = uuid.toString().replace("-", "");
        return appkey.substring(0, 16);
    }

    public static String generateAppSecret(String appkey) {
        return md5Salt(appkey).substring(0, 16);
    }

    /**
     * 加盐MD5
     * @param password
     * @return
     */
    public static String md5Salt(String password) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder(16);
        sb.append("hisense").append("juhaolian");
        int len = sb.length();
        if (len < 16) {
            for (int i = 0; i < 16 - len; i++) {
                sb.append("0");
            }
        }
        String salt = sb.toString();
        password = md5Hex(password + salt);
        char[] cs = new char[48];
        for (int i = 0; i < 48; i += 3) {
            cs[i] = password.charAt(i / 3 * 2);
            char c = salt.charAt(i / 3);
            cs[i + 1] = c;
            cs[i + 2] = password.charAt(i / 3 * 2 + 1);
        }
        return new String(cs);
    }

    /**
     * 获取十六进制字符串形式的MD5摘要
     */
    private static String md5Hex(String src) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bs = md5.digest(src.getBytes());
            return new String(new Hex().encode(bs));
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        String appKey = generateAppkey();
        System.out.println("AppKey: " + appKey);
        String appSecrect = generateAppSecret(appKey);
        System.out.println("AppSecrect: " + appSecrect);
    }

}
