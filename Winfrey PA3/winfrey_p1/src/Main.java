import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static int Operation(int op, int num1, int num2){

        SecureRandom rand = new SecureRandom();
        int out = 0;

        if(op>3){
            op = rand.nextInt(3);
        }

        switch (op) {
            case 0:
                System.out.println("How much is " + num1 + " plus "+ num2 + "?");
                out = num1 + num2;
                break;

            case 1:
                System.out.println("How much is " + num1 + " times "+ num2 + "?");
                out = num1 * num2;
                break;

            case 2:
                System.out.println("How much is " + num1 + " minus "+ num2 + "?");
                out = num1 - num2;
                break;

            case 3:
                System.out.println("How much is " + num1 + " divided by "+ num2 + "?");
                out = num1 / num2;
                break;

            default:
                op = 0;
                break;
        }
        return out;
    }

    public static int Diff(int num1) {
        int n;
        switch (num1) {
            case 0:
                n = 10;
                break;

            case 1:
                n = 100;
                break;

            case 2:
                n = 1000;
                break;

            case 3:
                n = 1000;
                break;

            default:
                n = 10;
                break;
        }

        return n;
    }

    public static void CorrectResponse(){

        SecureRandom rand = new SecureRandom();

        String[] ResTxt = new String[4];

        ResTxt[0] = "Very good!";
        ResTxt[1] = "Excellent!";
        ResTxt[2] = "Nice work!";
        ResTxt[3] = "Keep up the good work!";

        int resNum = rand.nextInt(4);
        System.out.println(ResTxt[resNum]);
    }

    public static void IncorrectResponse() {

        SecureRandom rand = new SecureRandom();

        String[] ResTxt = new String[4];

        ResTxt[0] = "No. Please try again.";
        ResTxt[1] = "Wrong. Try once more.";
        ResTxt[2] = "Don’t give up!";
        ResTxt[3] = "No. Keep trying.";

        int resNum = rand.nextInt(4);
        System.out.println(ResTxt[resNum]);

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        double userNum, answer, numRight = 0, numWrong = 0, grade;
        int ran1, ran2, diffIn, opIn ;
        boolean done = false;

                 System.out.println("Choose Difficulty: ");
            diffIn = scn.nextInt()-1;
            Diff(diffIn);

                 System.out.println("Choose Operation Type: ");
             opIn = scn.nextInt()-1;

        for (int i = 0; i < 10; ++i) {

            ran1 = rand.nextInt(Diff(diffIn));
            ran2 = rand.nextInt(Diff(diffIn));

            answer = Operation(opIn, ran1, ran2);

            userNum = scn.nextInt();

            if (userNum == answer) {
                CorrectResponse();
                numRight += 1;
            }
            else {
                IncorrectResponse();
                numWrong += 1;
            }
        } /*Compare answer for 10 q's*/


            grade = numRight / 10;
                System.out.println("Number Correct:" + numRight);
                 System.out.println("Number Incorrect:" +numWrong);

        if (grade>0.75) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else {
            System.out.println("Please ask your teacher for extra help.");
        }
    }
}
