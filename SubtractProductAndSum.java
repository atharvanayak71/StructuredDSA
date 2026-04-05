package StructuredDSA;

public class SubtractProductAndSum {
    static int SubtractProductAndSum(int n){

        int product = 1;
        int sum = 0;
        while(n !=0){
            int lastDigit = n %10;
            product = product * lastDigit;
            sum = sum + lastDigit;
            n = n /10;
        }
            return product - sum;
    }
    public static void main(String[] args) {
        int ans = SubtractProductAndSum(4421);
        System.out.println(ans);
    }
}
