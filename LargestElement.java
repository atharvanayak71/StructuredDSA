package StructuredDSA;


//Brute Force
//public class LargestElement {
//    static void largestElement(int [] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for(int j = 1; j<arr.length-1;j++){
//                if(arr[j-1]>arr[j]){
//                    int temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                    System.out.println(arr[arr.length-1]);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int [] arr = {1, 8, 7, 56, 90};
//        largestElement(arr);
//    }
//}


//Optimised
public class LargestElement {
    static void largestElement(int [] arr){
        int max=arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int [] arr = {45, 8, 1, 56, 90};
        largestElement(arr);
    }
}