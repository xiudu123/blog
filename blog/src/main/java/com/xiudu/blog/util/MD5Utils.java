package com.xiudu.blog.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * @author: 锈渎
 * @date: 2023/5/30 0:03
 * @code: 面向对象面向君， 不负代码不负卿。
 * @description: 用于密码加密
 */




public class MD5Utils {

    /**
     * MD5加密类
     * @param str 要加密得字符串
     * @return 加密后得字符串
     */

    public static String code(String str){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[]byteDigest = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < byteDigest.length; offset++) {
                i = byteDigest[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            //32位加密
            return buf.toString();
            // 16位的加密
            //return buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

    }


    public static void main(String[] args) {
        System.out.println(code("111111"));
    }
}
