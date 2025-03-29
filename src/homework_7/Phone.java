package homework_7;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        this("Unknown", "Unknown", 0.0);
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + ", номер: " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Сообщение отправлено на номера: ");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public void displayInfo() {
        System.out.println("Номер: " + number + ", Модель: " + model + ", Вес: " + weight);
    }
}
