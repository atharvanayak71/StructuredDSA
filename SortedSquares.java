package StructuredDSA;

//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

//Example 1:

//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].


import java.util.Arrays;

public class SortedSquares {
    static int[] sortedSquares(int [] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i] * nums[i];
        }
        for(int i=0; i<temp.length; i++){
            for(int j=1; j<temp.length-1; j++){
                if(temp[j]<temp[j-1]){
                    int temporary = temp[j];
                    temp[j] = temp[j-1];
                    temp[j-1] = temporary;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }
}
