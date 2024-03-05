//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner n1= new Scanner(System.in);
        System.out.println("Enter the number till which Fabonacci Series should be calcuated : ");
        int num=n1.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.println(0);
        System.out.println(1);
        if (num==0){
            System.out.println("0");
        }

        else {
            while (num>b){
            c=a+b;
            a=b;
            b=c;

                System.out.println(c);
            }
        }
    }
}
