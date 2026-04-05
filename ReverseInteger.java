package StructuredDSA;
import java.util.Scanner;

public class ReverseInteger {

    int ReverseInteger() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int reverse = 0;

        while (x != 0) {
            int lastDigit = x % 10;

            // Overflow check before multiplying by 10
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7))
                return 0;
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && lastDigit < -8))
                return 0;

            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        ReverseInteger rc = new ReverseInteger();
        System.out.println("Enter the number to be reversed:- ");
        System.out.println("Reversed Integer:- " + rc.ReverseInteger());
    }
}