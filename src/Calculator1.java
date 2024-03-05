//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner new1 = new Scanner(System.in);
        System.out.println(" Enter the First Number: ");
        int num1 = new1.nextInt();

        Scanner new2 = new Scanner(System.in);
        System.out.println(" Enter the Second Number: ");
        int num2 = new2.nextInt();


        System.out.println(" Choose the Operator: ");
        System.out.println(" 1) + ");
        System.out.println(" 2) - ");
        System.out.println(" 3) * ");
        System.out.println(" 4) / ");


        Scanner new3 = new Scanner(System.in);
        System.out.println(" Enter the Operator: ");
        int Opr = new3.nextInt();

        if (Opr == 1){
            System.out.println("The answer is : " + (num1+num2) );

        }
        else if (Opr == 2){
            System.out.println("The answer is : " + (num1-num2) );

        }
        else if (Opr == 3){
            System.out.println("The answer is : " + (num1*num2) );

        }
        else if (Opr == 4){
            System.out.println("The answer is : " + (num1/num2) );

        }
        else {
            System.out.println("Some Error Occured!!");

        }


    }
}
