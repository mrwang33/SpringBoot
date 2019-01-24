package wang.ggblog.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author wanghuan
 */
public class CommonUtil {

  public static String sha512(final String input) {
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-512");
      byte[] messageDigest = md.digest(input.getBytes());
      BigInteger no = new BigInteger(1, messageDigest);
      StringBuilder hashText = new StringBuilder(no.toString(16));
      while (hashText.length() < 128) {
        hashText.insert(0, "0");
      }
      return hashText.toString();
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    System.out.println(sha512("admin&123456:yzyx"));
    long l = System.currentTimeMillis();
    System.out.println("现在时间" + l);
    System.out.println(sha512(
        "5e3493044820cd6e284a7f0abacd78ab8eb8e83b26967f64e19671f1197b74540e5cc9bcf9370e154a2bea3d1fce99c211d58b67213088bf108fe25504e722e5"
            + l));
  }
}
