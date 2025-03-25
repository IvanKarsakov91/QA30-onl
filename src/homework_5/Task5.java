package homework_5;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Zero();
        One();

    }
    public static void Zero(){
        int[][][] array = new int[1][2][3];

        for (int k = 0; k < 1; k++) {
            for (int o = 0; o < 2; o++) {
                for (int z = 0; z < 3; z++) {
                    array[k][o][k] = (int) (Math.random() * 10) + 1;
                }
            }
        }

        System.out.println("Исходный массив:");
        printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, на которое нужно увеличить каждое число массива: ");
        int increaseValue = scanner.nextInt();

        for (int k = 0; k < 1; k++) {
            for (int o = 0; o < 2; o++) {
                for (int z = 0; z < 3; z++) {
                    array[k][o][z] += increaseValue;
                }
            }
        }

        System.out.println("Массив после увеличения:");
        printArray(array);
    }

    private static void printArray(int[][][] array) {
        for (int[][] one : array) {
            for (int[] two : one) {
                for (int three : two) {
                    System.out.print(three + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void One(){
        String[][] board = new String[8][8];
        System.out.print("Шахматная доска\n");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
            }
        }

        for (String[] row : board) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
