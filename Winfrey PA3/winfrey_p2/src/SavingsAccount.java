public class SavingsAccount {

    public static double annualInterestRate = 0.0;

    private double savingsBalance;


    public SavingsAccount(double total){
        this.savingsBalance = total;
    }

    public void calculateMonthlyInterest(){
        double monthlyInterest;
        monthlyInterest = (this.savingsBalance * annualInterestRate)/12;
        this.savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }

    public void printBalance(){
        System.out.printf("$%.2f", this.savingsBalance);
    }



}



