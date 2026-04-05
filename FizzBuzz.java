package StructuredDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i<=n; i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if (i%5==0){
                list.add("Buzz");
            } else
            list.add(String.valueOf(i));
        }
        System.out.println(list);
}
}
