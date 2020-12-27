package acme;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class App {
    public static String calculateMd5Hash(String password) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(password.getBytes());
        byte[] digest = messageDigest.digest();

        return DatatypeConverter.printHexBinary(digest).toUpperCase();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String md5Hash = calculateMd5Hash("password");

        System.out.printf("MD5: %s\n", md5Hash);
    }
}
