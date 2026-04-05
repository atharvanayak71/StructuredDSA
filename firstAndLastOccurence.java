/*
Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
        */

package StructuredDSA;

import java.util.Arrays;

public class firstAndLastOccurence {
    static int[] Search(int [] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int firstOccurence = -1;
        int lastOccurence = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                firstOccurence = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                lastOccurence = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return new int[]{firstOccurence, lastOccurence};
    }
    public static void main(String[] args) {
        int [] arr =  {1,3,5,5,7,9};
        int target = 5;
        int[] ans = Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
