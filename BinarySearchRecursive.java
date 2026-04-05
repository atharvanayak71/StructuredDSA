package StructuredDSA;

public class BinarySearchRecursive {
    static int binarysearch(int [] arr, int start, int end, int key){

        int mid = start + (end - start)/2;
        if(start>end){
            return - 1;
        }

        if(arr[mid]>key){
           return binarysearch(arr,start,mid-1,key);
        }if(arr[mid]<key){
           return binarysearch(arr, mid+1,end, key);
        } else {
            return mid;
        }

    }

    public static void main(String[] args) {
        int [] arr =  {1,3,5,7,9};
        int ans = binarysearch(arr, 0, arr.length, 5);
        System.out.println(ans);
    }
}
