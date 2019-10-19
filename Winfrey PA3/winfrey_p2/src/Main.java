public class Main {

    public static void main(String[] args) {

        double ratePer1 = 4, ratePer2 = 5;
        double rate1 = ratePer1 / 100, rate2 = ratePer2 / 100;
        double strtAmt1 = 2000, strtAmt2 = 3000;

            SavingsAccount saver1 = new SavingsAccount(strtAmt1);
            SavingsAccount saver2 = new SavingsAccount(strtAmt2);

            System.out.println("Month | Saver1 Total | Saver2 Total");

            for(int i=1; i<=12; ++i){
                SavingsAccount.modifyInterestRate(rate1);

                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();

                System.out.print(i + "     |   " );
                saver1.printBalance();
                System.out.print("   |   ");
                saver2.printBalance();
                System.out.println();

            }

            SavingsAccount.modifyInterestRate(rate2);

                    System.out.println("Next Month at 5%: \t");
                System.out.print("Saver1: ");
                saver1.calculateMonthlyInterest();
                saver1.printBalance();
                    System.out.println();
                System.out.print("Saver2: ");
                saver2.calculateMonthlyInterest();
                saver2.printBalance();
        }
    }
