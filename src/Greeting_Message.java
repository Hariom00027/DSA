//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class Greeting_Message {
    public static void main(String[] args) {
        Scanner Name1 = new Scanner(System.in);
        System.out.println("Enter the Name of the person: ");
        String Name = Name1.next();
        System.out.println("Happy Birthday" + " " + Name);
    }
}
