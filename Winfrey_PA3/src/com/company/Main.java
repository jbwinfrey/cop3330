package com.company;
import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static int Multi(int num1, int num2){

        System.out.println("How much is " + num1 + " times "+ num2 + "?");
        return num1 * num2;
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

        double numRight = 0, grade =0;
        int userNum, ran1, ran2, answer, diff ;
        boolean done = false;

        diff = 2;


         for (int i = 0; i < 10; ++i) {

             ran1 = rand.nextInt(diff);
             ran2 = rand.nextInt(diff);

             answer = Multi(ran1,ran2);

                 userNum = scn.nextInt();

            if (userNum == answer) {
                     CorrectResponse();
                     numRight += 1;
                 }
            else {
                     IncorrectResponse();
                 }
         }

        grade = numRight / 10;
        //System.out.println(grade);

        if (grade>0.75) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else {
            System.out.println("Please ask your teacher for extra help.");
        }
    }
}
