//Area Of Circle Java Program

import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Enter the Radius of the circle: ");
        int r=n1.nextInt();

        if(r>=0){
            System.out.println("The area of the Circle is: "+(3.1415*r));
        }
        else {
            System.out.println("The radius can not be less than zero");
        }
    }
}
