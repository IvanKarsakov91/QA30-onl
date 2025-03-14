package homework_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        switchcase();
        ifelse();
        three();
        temperature();
        rainbow();
        oddNumbers();
        fromFivetoOne();
        Summ();
        Calculator();
        Generator();
        fromtenTotwenty();

    }

    public static Scanner inputData() {
        return new Scanner(System.in);
    }

    public static void switchcase() {
        System.out.println("Программа определения поры года Switch");
        System.out.print("Введите номер месяца (1-12): ");
        int month = inputData().nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца. Введите число от 1 до 12.");
                break;
        }
    }
    public static void ifelse() {
        System.out.println("Программа определения поры года IfElse");
        System.out.print("Введите номер месяца (1-12): ");
        int month = inputData().nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Неверный номер месяца. Введите число от 1 до 12.");
        }
    }
    public static void three() {

        System.out.println("Программа четных и нечетных чисел");
        System.out.print("Введите число: ");
        int number = inputData().nextInt();

        if (number % 2 == 0) {
            System.out.println("Число четное.");
        } else {
            System.out.println("Число нечетное.");
        }
    }
    public static void temperature() {
        System.out.println("Погода ");
        System.out.print("Введите температуру на улице: ");
        int t = inputData().nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t <= -5 && t > -20) {
            System.out.println("Нормально");
        } else if (t <= -20) {
            System.out.println("Холодно");
        }
    }
    public static void rainbow(){
        System.out.println("Цвета радуги");
        System.out.print("Введите номер цвета: ");
        int num = inputData().nextInt();
        switch (num) {
            case (1):
                System.out.println("Крассный");
                break;
            case (2):
                System.out.println("Оранжевый");
                break;
            case (3):
                System.out.println("Жёлтый");
                break;
            case (4):
                System.out.println("Зелёный");
                break;
            case (5):
                System.out.println("Голубой");
                break;
            case (6):
                System.out.println("Синий");
                break;
            case (7):
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Неверный номер введите от 1 до 7");
                break;

        }
    }
    public static void oddNumbers() {
        System.out.println("Нечетные числа от 1 до 99");
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
            }
        }
    public static void fromFivetoOne() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
    public static void Summ() {
        System.out.println("Введите положительное число: ");
        int num = inputData().nextInt();
     if (num <= 0) {
        System.out.println("Ошибка: введите положительное число.");
    } else {
         int sum = 0;
         for (int i = 1; i <= num; i++) {
             sum += i;
         }
         System.out.println("Сумма чисел от 1 до " + num + " равна " + sum);
     }
    }
        public static void Calculator() {
            int number = 7;
            int limit = 98;

            while (number <= limit) {
                System.out.print(number + " ");
                number += 7;
            }
        }
    public static void Generator() {
        int num = 0;
        int count = 0;

        while (count < 10) {
            System.out.print(num + " ");
            num -= 5;
            count++;
        }
    }
    public static void fromtenTotwenty () {
        int num = 10;

        while (num <= 20) {
            System.out.println("Квадрат числа " + num + " = " + (num * num));
            num++;
        }
    }
}




