
public class Application {

    public static void main(String args[]) {

        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);

        System.out.print("\nInitial Savings Balance: $2000.00, 12 month investment at a 4% Annual Interest Rate");

        saver1.calculateMonthlyInterest();

        System.out.print("\nInitial Savings Balance: $3000.00, 12 month investment at a 4% Annual Interest Rate");

        saver2.calculateMonthlyInterest();

        System.out.print("\nInitial Savings Balance: $2000.00, 12 month investment at a 5% Annual Interest Rate\n");

        saver1.calculateMonthlyInterest();

        System.out.print("\n");

        System.out.print("\nInitial Savings Balance: $3000.00, 12 month investment at a 5% Annual Interest Rate\n");

        saver2.calculateMonthlyInterest();

        System.out.print("\n");

    }

}

