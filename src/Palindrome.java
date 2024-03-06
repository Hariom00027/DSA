//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Enter the String to check");
        String str=new1.next();
        String rev = "";
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        System.out.println(ans);
    }
}
