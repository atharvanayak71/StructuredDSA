package StructuredDSA;

public class ThirdLargest {
    static void ThirdMax(int [] nums){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int thirdmax=Integer.MIN_VALUE;

        boolean foundSecond = false;
        boolean foundThird = false;


        for(int i = 0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>secondMax && nums[i]!=max ){
                secondMax = nums[i];
                foundSecond = true;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>thirdmax && nums[i]!=secondMax && nums[i]!=max){
                thirdmax = nums[i];
                foundThird = true;
            }
        }
        if(!foundThird) {
            thirdmax = max;
        }
        System.out.println(thirdmax);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,-2147483648};
        ThirdMax(arr);
    }
}
