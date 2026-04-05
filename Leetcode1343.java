package StructuredDSA;

public class Leetcode1343 {
        static int numOfSubarrays(int[] arr, int k, int threshold) {
            int low = 0;
            int n = arr.length;
            int sum = 0;
            int count = 0;
            for(int i = 0; i < k; i++){
                sum = sum + arr[i];
            }  if(sum>=k*threshold){
                count++;
            }
            for(int i = k; i < n; i++){
                sum = sum + arr[i];
                sum = sum - arr[i-k];
                if(sum>=k*threshold){
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        int [] arr = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;
        int ans = numOfSubarrays(arr, k, threshold);
        System.out.println(ans);
    }
    }
