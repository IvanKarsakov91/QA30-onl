package homework_3;

import java.util.Scanner;
// Использование switch-case
public class Task3 {
    public static void main(String[] args) {
        switchcase();
        ifelse();

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
    // Использование ifelse
        public static void ifelse() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Программа определения поры года IfElse");
            System.out.print("Введите номер месяца (1-12): ");
            int month = inputData().nextInt();

            // Использование if-else-if для определения поры года
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
    }

