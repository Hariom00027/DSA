import java.util.Scanner;

//Input currency in rupees and output in USD.
public class INR2USD {
    public static void main(String[] args) {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Enter the Amount in INR: ");
        float num = new1.nextFloat();

        System.out.println("The amount in USD is : " + num*80);
    }
}
