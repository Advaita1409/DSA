import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class Des {
    public static void dd(String[] args) {
        try {
            String originalText = "Hello, DES!";
            String key = "secretKey";

            System.out.println("Original Text: " + originalText);

            
            String encryptedText = encrypt(originalText, key);
            System.out.println("Encrypted Text: " + encryptedText);

            
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Decrypted Text: " + decryptedText);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String text, String key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");

        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());
        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);

        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(text.getBytes());

        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String encryptedText, String key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");

        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());
        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);

        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));

        return new String(decryptedBytes);
    }
}
  