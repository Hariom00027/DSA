//Area of parallelogram

import java.util.Scanner;

public class Area_Parallelogram {
    public static void main(String[] args) {
        Scanner n1= new Scanner(System.in);
        System.out.println("Enter the Height of the Parallelogram");
        int H = n1.nextInt();

        Scanner n2= new Scanner(System.in);
        System.out.println("Enter the base of the Parallelogram");
        int B = n2.nextInt();

        System.out.println("The area of the given Parallelogram is: "+ B*H);
    }
}
