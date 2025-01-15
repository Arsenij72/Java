public class Debt {
    private double balance;
    private double interestRate;


    public Debt(double initialBalance, double initialinterestRate) {

        this.balance = initialBalance;
        this.interestRate = initialinterestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);

    }

    public void waitOneYear() {
        this.balance = balance * interestRate;

    }
}


