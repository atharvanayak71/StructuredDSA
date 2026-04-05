package StructuredDSA;

public class SearchInsertPosition {
    static int Search(int [] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int ans = Search(new int[]{1,3,5,7,9},6);
        System.out.println(ans);
    }
}


