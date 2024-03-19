//Area of an Isosceles Triangle


import java.util.Scanner;

public class Area_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner n1= new Scanner(System.in);
        System.out.println("Enter the Height of the triangle");
        int H = n1.nextInt();

        Scanner n2= new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        int B = n2.nextInt();

        System.out.println("The area of the given triangle is: "+ (B*H)/2);

    }
}
