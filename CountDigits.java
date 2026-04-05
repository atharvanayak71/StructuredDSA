package StructuredDSA;
//import java.util.Scanner;
class Count {
   // Scanner sc = new Scanner(System.in);
    int n = 1248;

    int Count() {
        int original = n;
        int count = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            if(original%lastDigit==0){
                count++;
            }
            n= n/10;
        }
        return count;
    }
}

public class CountDigits {
    public static void main(String[] args) {
        Count c = new Count();
        System.out.println(c.Count());
    }
}
