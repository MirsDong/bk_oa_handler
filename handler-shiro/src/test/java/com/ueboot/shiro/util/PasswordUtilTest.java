package com.ueboot.shiro.util;

import org.junit.Assert;
import org.junit.Test;

public class PasswordUtilTest {

   @Test
    public void sha512() {
       Assert.assertEquals("d71e762f824bd6f39c505fa6804a3a20f3dc7e2fd8b4a0a5691bfd5326c061e2d84a0ee306a864955599f92c03840c5db3706a21484e8a0ee35539951e1f042b",PasswordUtil.sha512("root","111111"));
    }

//    @Test
//    public  void test(){
//        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
//        EnvironmentPBEConfig config = new EnvironmentPBEConfig();
//        config.setAlgorithm("PBEWithMD5AndDES");          // 加密的算法，这个算法是默认的
//        config.setPassword("ueboot");                        // 加密的密钥
//        standardPBEStringEncryptor.setConfig(config);
////        String plainText = "jdbc:mysql://mysql:10208/senseface?";
//        //String encryptedText = standardPBEStringEncryptor.encrypt("jdbc:mysql://localhost:3306/ueboot-shiro?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false&allowMultiQueries=true");
//        String encryptedText = standardPBEStringEncryptor.encrypt("jdbc:mysql://localhost:3306/ueboot-shiro?useSSL=false&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull");
//        System.out.println(encryptedText);
//        String test = standardPBEStringEncryptor.decrypt("xIOpQ585xlp0nREocHniEa/v5Ybdqx2W");
//        String pws = standardPBEStringEncryptor.encrypt("123456");
//        System.out.println(test);
//        System.out.println(pws);
//    }
}
