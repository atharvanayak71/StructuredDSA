package StructuredDSA;

    public class DuplicateRBS {
        static boolean search(int[] nums, int target) {
            int start = 0, end = nums.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] == target) {
                    return true;
                }

                if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                    start++;
                    end--;
                }
                else if (nums[start] <= nums[mid]) {
                    if (target >= nums[start] && target < nums[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                else {
                    if (target > nums[mid] && target <= nums[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int [] arr = {2,5,6,0,0,1,2};
            int start = 0;
            int end = arr.length-1;
            boolean ans = search(arr,0);
            System.out.println(ans);
        }
    }
