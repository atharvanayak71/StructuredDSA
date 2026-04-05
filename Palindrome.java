package StructuredDSA;
import java.util.Scanner;

class PalindromeNumber {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    boolean isPalindrome() {
        int reverse = 0;
        int original = x;
        while (x != 0) {
            int lastDigit = x % 10;
            reverse = (reverse * 10) + lastDigit;
            x = x / 10;
        }
        if(original==reverse&&original>=0){
            return true;
        }
        return false;
    }
}
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter number to be checked: ");
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalindrome());
    }
}
