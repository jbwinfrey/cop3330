package com.company;
import java.security.SecureRandom;
import java.util.Scanner;

public class winfrey_p1 {

    public static int Multi(int num1, int num2){

        System.out.println("How much is " + num1 + " times "+ num2 + "?");
        return num1 * num2;

       /* int n;
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
        }*/
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

        double numRight = 0, grade =0;
        int userNum, ran1, ran2, answer, diffIn ;
        boolean done = false;

        System.out.println("Choose Difficulty: ");
        diffIn = scn.nextInt()-1;
        Diff(diffIn);
        System.out.println(diffIn +" "+ Diff(diffIn));

        for (int i = 0; i < 10; ++i) {

            ran1 = rand.nextInt(Diff(diffIn));
            ran2 = rand.nextInt(Diff(diffIn));

            answer = Multi(ran1,ran2);

            userNum = scn.nextInt();

            if (userNum == answer) {
                CorrectResponse();
                numRight += 1;
            }
            else {
                IncorrectResponse();
            }
        } /*Compare answer for 10 q's*/


        grade = numRight / 10;

        if (grade>0.75) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else {
            System.out.println("Please ask your teacher for extra help.");
        }
    }
}
