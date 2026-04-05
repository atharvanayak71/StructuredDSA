package StructuredDSA;

public class MinInRBS {
    static int findMin(int [] nums){
        int pivot = Pivot(nums, 0, nums.length-1);
        if(pivot == -1){
            return nums[0];
        } else{
            return nums[pivot+1];
        }
    }

    static int Pivot(int [] nums, int start, int end){
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
        int ans = findMin(arr);
        System.out.println(ans);
    }
}
