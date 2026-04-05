/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function,
nums is possibly left rotated at an unknown index k (1 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target,
return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
        */

package StructuredDSA;

public class RotatedBinarySearch {
    static int search(int [] nums, int start, int end, int target) {
        int pivot = findPivot(nums, start, end);
            if (pivot == -1) {
                return BinarySearch(nums, start, end, target);
            }
            if (nums[pivot]==target) {
                return pivot;
            }
            if (nums[0] > target) {
               return BinarySearch(nums, pivot + 1, nums.length - 1, target);
            }
            return BinarySearch(nums, 0, pivot - 1, target);
    }
    static int BinarySearch(int [] nums, int start, int end, int target){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivot(int [] nums, int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            } if (mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            } if(nums[0]>nums[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return - 1;
    }

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int start = 0;
        int end = arr.length-1;
        int ans = search(arr, start, end, 1);
        System.out.println(ans);
    }
}
