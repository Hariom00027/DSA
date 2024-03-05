//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Simple_Interest_Calculator {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Value of Principal");
        float P = num.nextFloat();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter the Value of Time");
        int T = num.nextInt();


        Scanner num3 = new Scanner(System.in);
        System.out.println("Enter the Value of Rate");
        float R = num.nextFloat();

        System.out.println("The Simple interest is:" +" "+ (P*T*R)/100);
    }
}
