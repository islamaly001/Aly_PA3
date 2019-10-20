package savingsaccount;

class SavingsAccount{
    public static double annualInterestRate = 0.0;

    private double savingsBalance; // private instance variable


    public SavingsAccount(double amt){
        this.savingsBalance = amt;
    }


    public void cMI(){
        double interest;
        interest = (this.savingsBalance * (annualInterestRate/100))/12;
        this.savingsBalance += interest;
    }


    public void showBal(){
        System.out.printf("$%.2f", this.savingsBalance);
    }

    // to set the static variable
    public static void mIR(double newRate){
        annualInterestRate = newRate;
    }
}

public class Mainclass{
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.mIR(4.0); // setting interest rate to 4.0%
        System.out.println("Month \t\t Saver1 \t Saver2");

// Displaying data of two instances for 12 months
        for(int i=1; i<=12; ++i){
            saver1.cMI();
            saver2.cMI();
            System.out.print("Month " + i + ": \t");
            saver1.showBal();
            System.out.print("\t");
            saver2.showBal();
            System.out.println();
        }
        System.out.println();

        System.out.println("Interest Rate now to 5.0%");
        System.out.println();
        SavingsAccount.mIR(5.0);

// Calculating new Savings Balance
        saver1.cMI();
        saver2.cMI();


        System.out.print("Month 12: \t");
        saver1.showBal();
        System.out.print("\t");
        saver2.showBal();
        System.out.println();
    }
}
