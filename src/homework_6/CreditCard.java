package homework_6;

public class CreditCard {
        private String accountNumber;
        private double balance;

        public CreditCard(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Недостаточно средств на счете " + accountNumber);
            } else {
                balance -= amount;
            }
        }

        public void displayInfo() {
            System.out.println("Номер счета: " + accountNumber + ", Текущая сумма: " + balance);
        }
}
