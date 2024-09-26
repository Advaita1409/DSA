import java.util.Arrays;

public class PlayfairCipher {

    private char[][] keyMatrix;

    public PlayfairCipher(String key) {
        generateKeyMatrix(key);
    }

    private void generateKeyMatrix(String key) {
        key = key.toUpperCase().replaceAll("[^A-Z]", "");
        keyMatrix = new char[5][5];
        String keyWithoutDuplicates = removeDuplicateChars(key + "ABCDEFGHIKLMNOPQRSTUVWXYZ");

        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                keyMatrix[i][j] = keyWithoutDuplicates.charAt(k++);
            }
        }
    }

    private String removeDuplicateChars(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    private int[] findPosition(char c) {
        int[] result = new int[2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (keyMatrix[i][j] == c) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    public String encrypt(String plaintext) {
        plaintext = plaintext.toUpperCase().replaceAll("[^A-Z]", "");

        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i += 2) {
            char firstChar = plaintext.charAt(i);
            char secondChar;
            if (i + 1 < plaintext.length()) {
                secondChar = plaintext.charAt(i + 1);
            } else {
                secondChar = 'X';
            }

            int[] firstCharPos = findPosition(firstChar);
            int[] secondCharPos = findPosition(secondChar);

            if (firstCharPos[0] == secondCharPos[0]) { // Same row
                ciphertext.append(keyMatrix[firstCharPos[0]][(firstCharPos[1] + 1) % 5]);
                ciphertext.append(keyMatrix[secondCharPos[0]][(secondCharPos[1] + 1) % 5]);
            } else if (firstCharPos[1] == secondCharPos[1]) { // Same column
                ciphertext.append(keyMatrix[(firstCharPos[0] + 1) % 5][firstCharPos[1]]);
                ciphertext.append(keyMatrix[(secondCharPos[0] + 1) % 5][secondCharPos[1]]);
            } else { // Forming a rectangle
                ciphertext.append(keyMatrix[firstCharPos[0]][secondCharPos[1]]);
                ciphertext.append(keyMatrix[secondCharPos[0]][firstCharPos[1]]);
            }
        }

        return ciphertext.toString();
    }

    public static void main(String[] args) {
        PlayfairCipher playfairCipher = new PlayfairCipher("KEYWORD");

        String plaintext = "HELLO";
        System.out.println("Plaintext: " + plaintext);

        String ciphertext = playfairCipher.encrypt(plaintext);
        System.out.println("Ciphertext: " + ciphertext);
    }
}
