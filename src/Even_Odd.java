import java.util.Scanner;

public class Even_Odd{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Number to check if it is Even or Odd");
        int num1 = num.nextInt();
        if (num1 == 1){
            System.out.println("1 is Nither Even nor Odd");
        } else if (num1%2==0) {
            System.out.println(num1 +"  "+ "Is Even");

        }
        else{
            System.out.println(num1+"  "+"Is Odd");
        }

    }
}