package homework_4;

import java.util.Arrays;
import java.util.Scanner;


public class Task4 {
        public static void main(String[] args) {
            Zero();
            One();
            Two();
            Three();
        }

        public static Scanner inputData() {
            return new Scanner(System.in);
        }
    public static void Zero(){
        int[] array = new int[] {28, 14, 6, 19, 15, 42, 9};

        System.out.print("Введите число для поиска: ");
        int userValue = inputData().nextInt();

        int arrayValue = -1;
        for (int i = 0; i < array.length; i++) {
            if (userValue == array[i]) {
                arrayValue = userValue;
                break;
            }

        }
        if (arrayValue != -1) {
            System.out.println("Число " + arrayValue + " присутствует в массиве.");
        } else {
            System.out.println("Число " + userValue + " отсутствует в массиве.");
        }
    }
    public static void One(){
        int[] array = new int[] {28, 14, 6, 19, 15, 42, 9};

        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.print("Введите число для удаления: ");
        int userValue  = inputData().nextInt();

        int count = 0;
        for (int num : array) {
            if (num == userValue ) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Число " + userValue  + " отсутствует в массиве.");
        } else {
            int[] newArray = new int[array.length - count];
            int index = 0;
            for (int num : array) {
                if (num != userValue ) {
                    newArray[index++] = num;
                }
            }
            System.out.println("Массив после удаления: " + Arrays.toString(newArray));
        }
    }
    public static void Two(){

        System.out.print("Введите длину массива: ");
        int size = inputData().nextInt();

        if (size <= 0) {
            System.out.println("Длина массива должна обозначаться положительным числом.");
            return;
        }

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Массив по Вашему запросу: " + Arrays.toString(array));

        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }

        double average = (double) sum / size;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
        System.out.println("Минимальное значение: " + min);
    }
    public static void Three(){
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));

        double avg1 = calculateAverage(array1);
        double avg2 = calculateAverage(array2);

        System.out.println("Среднее арифметическое массива 1: " + avg1);
        System.out.println("Среднее арифметическое массива 2: " + avg2);

        if (avg1 > avg2) {
            System.out.println("Среднее арифметическое первого массива больше.");
        } else if (avg2 > avg1) {
            System.out.println("Среднее арифметическое второго массива больше.");
        } else {
            System.out.println("Средние арифметические массивов равны.");
        }
    }

    private static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}

