import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the message to be encrypted
        System.out.print("Enter the message to encrypt: ");
        String message = scanner.nextLine();

        // Input the shift value
        System.out.print("Enter the shift value (an integer): ");
        int shift = scanner.nextInt();

        // Encrypt the message
        String encryptedMessage = encrypt(message, shift);

        // Display the encrypted message
        System.out.println("Encrypted message: " + encryptedMessage);

        // Decrypt the message to verify
        String decryptedMessage = decrypt(encryptedMessage, shift);
        System.out.println("Decrypted message: " + decryptedMessage);

        scanner.close();
    }

    // Method to encrypt the message using Caesar Cipher
    public static String encrypt(String message, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
                char encryptedChar = (char) ((currentChar - base + shift) % 26 + base);
                result.append(encryptedChar);
            } else {
                // If the character is not a letter, keep it unchanged
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    // Method to decrypt the message
    public static String decrypt(String message, int shift) {
        // Decrypting is the same as encrypting with a negative shift
        return encrypt(message, -shift);
    }
}
