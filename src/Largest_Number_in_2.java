import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class Largest_Number_in_2 {
    public static void main(String[] args) {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1= new1.nextInt();


        Scanner new2 = new Scanner(System.in);
        System.out.println("Enter the Second Number: ");
        int num2= new2.nextInt();

        if (num1>num2){
            System.out.println(num1 + " is Grater than " + num2);

        }
        else if (num1==num2) {
            System.out.println(num1 + " is equal to " + num2);
        }
        else {
            System.out.println(num1 + " is Smaller than " + num2);
        }

    }
}
