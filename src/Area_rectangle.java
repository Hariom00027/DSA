//Area of rectangle


import java.util.Scanner;

public class Area_rectangle {
    public static void main(String[] args) {
        Scanner n1= new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle");
        int H = n1.nextInt();

        Scanner n2= new Scanner(System.in);
        System.out.println("Enter the width of the Rectangle");
        int B = n2.nextInt();

        System.out.println("The area of the given Rectangle is: "+ B*H);
    }
}
