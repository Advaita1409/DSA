import java.util.Scanner;

public class VigenereCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the plaintext: ");
        String plaintext = scanner.nextLine().toUpperCase(); // Convert to uppercase for simplicity
        System.out.print("Enter the key: ");
        String key = scanner.nextLine().toUpperCase(); // Convert to uppercase for simplicity

        String ciphertext = encrypt(plaintext, key);
        System.out.println("Encrypted text: " + ciphertext);

        String decryptedText = decrypt(ciphertext, key);
        System.out.println("Decrypted text: " + decryptedText);

        scanner.close();
    }

    private static String encrypt(String plaintext, String key) {
        StringBuilder ciphertext = new StringBuilder();
        int keyLength = key.length();

        for (int i = 0; i < plaintext.length(); i++) {
            char plainChar = plaintext.charAt(i);

            if (Character.isLetter(plainChar)) {
                char keyChar = key.charAt(i % keyLength);
                char encryptedChar = (char) ((plainChar + keyChar - 2 * 'A') % 26 + 'A');
                ciphertext.append(encryptedChar);
            } else {
                // Non-alphabetic characters remain unchanged
                ciphertext.append(plainChar);
            }
        }

        return ciphertext.toString();
    }

    private static String decrypt(String ciphertext, String key) {
        StringBuilder decryptedText = new StringBuilder();
        int keyLength = key.length();

        for (int i = 0; i < ciphertext.length(); i++) {
            char encryptedChar = ciphertext.charAt(i);

            if (Character.isLetter(encryptedChar)) {
                char keyChar = key.charAt(i % keyLength);
                char decryptedChar = (char) ((encryptedChar - keyChar + 26) % 26 + 'A');
                decryptedText.append(decryptedChar);
            } else {
                // Non-alphabetic characters remain unchanged
                decryptedText.append(encryptedChar);
            }
        }

        return decryptedText.toString();
    }
}
