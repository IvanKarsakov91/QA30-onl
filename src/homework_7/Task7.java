package homework_7;

public class Task7 {
    public static void main(String[] args) {
        // Создание трех объектов Phone
        Phone phone1 = new Phone("554456582", "Iphone", 220.0);
        Phone phone2 = new Phone("789545632", "Samsung", 250.0);
        Phone phone3 = new Phone("458565425", "Pocco", 180.0);

        // Вывод значений переменных объектов
        phone1.displayInfo();
        phone2.displayInfo();
        phone3.displayInfo();

        // Вызов методов
        phone1.receiveCall("Зоя");
        phone2.receiveCall("Вера", "343223453");
        phone3.sendMessage("4678764532", "5748376578", "645890478");

        // Получение номера телефона
        System.out.println("Номер телефона 1: " + phone1.getNumber());
        System.out.println("Номер телефона 2: " + phone2.getNumber());
        System.out.println("Номер телефона 3: " + phone3.getNumber());
    }
}

