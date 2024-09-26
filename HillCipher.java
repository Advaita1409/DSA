import java.util.Scanner;

public class HillCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the key matrix (3x3):");
        int[][] keyMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                keyMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the message to encrypt (in uppercase):");
        scanner.nextLine();  // Consume the newline character
        String input = scanner.nextLine();

        String encryptedText = encrypt(input, keyMatrix);
        System.out.println("Encrypted message: " + encryptedText);

        scanner.close();
    }

    private static String encrypt(String input, int[][] keyMatrix) {
        int length = input.length();
        int[][] messageMatrix = new int[length / 3][3];
        int index = 0;

        // Convert the input message to a matrix of numbers
        for (int i = 0; i < length / 3; i++) {
            for (int j = 0; j < 3; j++) {
                messageMatrix[i][j] = (int) input.charAt(index) - 'A';
                index++;
            }
        }

        // Multiply the key matrix with the message matrix
        int[][] resultMatrix = multiplyMatrices(messageMatrix, keyMatrix);

        // Convert the result matrix back to a string
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < length / 3; i++) {
            for (int j = 0; j < 3; j++) {
                encryptedText.append((char) (resultMatrix[i][j] % 26 + 'A'));
            }
        }

        return encryptedText.toString();
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] resultMatrix = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                resultMatrix[i][j] %= 26; // Take modulo 26 to ensure result is in the range [0, 25]
            }
        }

        return resultMatrix;
    }
}
