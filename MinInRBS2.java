package StructuredDSA;

    public class MinInRBS2 {
        static int findMin(int [] nums){
            int start = 0;
            int end = nums.length-1;

            while(start<end){
                int mid = start + (end - start)/2;

                if(nums[mid]>nums[end]){
                    start = mid + 1;
                }
                if(nums[mid]<nums[end]){
                    //right part sorted hai aur mid minimum ho skta
                    mid = end;
                }
                //agr minimum start se lekar mid-1 tak hai to array ko shrink krte jate jb tk start == mid nhi ho jata
                //aur wahi last value minimum hogi
                if(nums[mid]==nums[end]){
                    end--;
                }
            }
            return nums[start];
        }

        public static void main(String[] args) {
            int [] arr = {3,1,3};
            int ans = findMin(arr);
            System.out.println(ans);
        }
    }
