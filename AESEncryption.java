import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class AESEncryption {
    public static void main(String[] args) {
        try {
            // Get secret key from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter secret key (16 characters): ");
            String secretKey = scanner.nextLine();

            // Get plaintext from user
            System.out.print("Enter plaintext: ");
            String plaintext = scanner.nextLine();

            // Encrypt
            String encryptedText = encryptAES(plaintext, secretKey);
            System.out.println("Encrypted Text: " + encryptedText);

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String encryptAES(String plaintext, String secretKey) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
}