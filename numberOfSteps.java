package StructuredDSA;

public class numberOfSteps {
    static int numberOfSteps(int num){
        int steps = 0;
        while(num!=0){
            if(num%2==0){
                num = num/2;
                steps++;
            }
                num = num-1;
                steps++;
            }
        return steps;
    }

    public static void main(String[] args) {
        int ans = numberOfSteps(14);
        System.out.println(ans);
    }
}
