import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class ECC {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, NoSuchProviderException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
        keyGen.initialize(new ECGenParameterSpec("secp256r1"), new SecureRandom());
        KeyPair ecKeyPair = keyGen.generateKeyPair();
        

        Cipher iesCipher = Cipher.getInstance("AES/CBC/NoPadding");
        Cipher iesDecipher = Cipher.getInstance("AES/CBC/NoPadding");
        iesCipher.init(Cipher.ENCRYPT_MODE, ecKeyPair.getPublic());

        String message = "Hello World";

        byte[] ciphertext = iesCipher.doFinal(message.getBytes());
        System.out.println(Hex.toHexString(ciphertext));

        iesDecipher.init(Cipher.DECRYPT_MODE, ecKeyPair.getPrivate(), iesCipher.getParameters());
        byte[] plaintext = iesDecipher.doFinal(ciphertext);

        System.out.println(new String(plaintext));
    }

    public void testEncryptDecrypt() throws Exception {}

}


