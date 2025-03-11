package homework_3;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args){
        // Method calls
        // Вызываете методы и проверяете результаты
        // После этого подгружаете все, как я вам и показывал
        // В ТГ в группе ДЗ ставите + с указанием номера домашки
        // Например, ДЗ3 +, ДЗ4 +
        String name = input().nextLine();
    }

    // Одно задание - один метод

    public static Scanner input(){
        return new Scanner(System.in);
    }
}

public class BMI {
    public static void main(String[] args){
        startBMI();
    }

    public static void startBMI(){
        getInitialMsg();
        getBMIData();
    }

    public static void getInitialMsg(){
        System.out.println("Инструкция калькулятора индекса массы тела");
        System.out.println("Значения ниже 18.5-Недобор веса");
        System.out.println("Значения от 18.5 до 24.9-Нормальный вес");
        System.out.println("Значения от 25 до 29.9-Лишний вес");
        System.out.println("Значения от 30 до 39.9-Ожирение 1 степени");
        System.out.println("Значения от 40 Ожирение 2 степени");
    }
    public static void getBMIData(){

    }
}