package homework_7;

public class Task7 {
    public static void main(String[] args) {
        // Создание трех объектов Phone
        Phone phone1 = new Phone("123456789", "ModelX", 200.5);
        Phone phone2 = new Phone("987654321", "ModelY", 180.0);
        Phone phone3 = new Phone("555555555", "ModelZ", 150.0);

        // Вывод значений переменных объектов
        phone1.displayInfo();
        phone2.displayInfo();
        phone3.displayInfo();

        // Вызов методов
        phone1.receiveCall("Алиса");
        phone2.receiveCall("Боб", "123123123");
        phone3.sendMessage("111111111", "222222222", "333333333");

        // Получение номера телефона
        System.out.println("Номер телефона 1: " + phone1.getNumber());
        System.out.println("Номер телефона 2: " + phone2.getNumber());
        System.out.println("Номер телефона 3: " + phone3.getNumber());
    }
}

