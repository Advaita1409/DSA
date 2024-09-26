import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import java.util.Base64;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner obj=new Scanner(System.in);
        // Generate key pair
        KeyPair keyPair = generateKeyPair();

        // Message to be encrypted
        System.out.println("Enter message");
        String originalMessage = obj.nextLine();

        // Encrypt the message
        byte[] encryptedMessage = encrypt(originalMessage, keyPair.getPublic());

        // Decrypt the message
        String decryptedMessage = decrypt(encryptedMessage, keyPair.getPrivate());

        // Display results
        System.out.println("Original Message: " + originalMessage);
        System.out.println("Encrypted Message: " + bytesToBase64(encryptedMessage));
        System.out.println("Decrypted Message: " + decryptedMessage);
    }

    private static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048); // You can adjust the key size as needed

        return keyPairGenerator.generateKeyPair();
    }

    private static byte[] encrypt(String plaintext, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        return cipher.doFinal(plaintext.getBytes());
    }

    private static String decrypt(byte[] ciphertext, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        return new String(cipher.doFinal(ciphertext));
    }

    private static String bytesToBase64(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }
}