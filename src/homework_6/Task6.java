package homework_6;

public class Task6 {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("545865", 8452);
        CreditCard card2 = new CreditCard("789451", 7586);
        CreditCard card3 = new CreditCard("774456", 4522);

        card1.deposit(300);
        card2.deposit(800);
        card3.withdraw(873);


        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}
