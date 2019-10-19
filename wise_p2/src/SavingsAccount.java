public class SavingsAccount {

    static double annualInterestRate = .04;
    private double savingsBalance;
    double add;
    int i;
    static int j = 0;

    public void setSavingsBalance(int amount) {

        savingsBalance = amount;

    }

    public double getSavingsBalance() {

        return savingsBalance;

    }

    public void printVariable() {

        System.out.printf("You have $" + getSavingsBalance());

    }

    public void calculateMonthlyInterest() {

        add = (getSavingsBalance() * annualInterestRate) / 12;

        j++;

        if(j > 2) {

            modifyInterestRate();

            savingsBalance += add;

            System.out.printf("Next Month: $%.2f", savingsBalance);

            return;

        }

        System.out.print("\n");

        for(i = 0; i < 12; i++) {

            savingsBalance += add;

            System.out.printf("Month %d: $%.2f\n", i + 1, savingsBalance);

            add = (getSavingsBalance() * annualInterestRate) / 12;

        }

    }

    public void modifyInterestRate() {

        annualInterestRate = .05;

    }

}

