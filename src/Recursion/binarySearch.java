package Recursion;

public class binarySearch {
    public static void main(String[] args) {
//        int[] arr = { 20 , 30 , 40 , 50 , 60 };
        int[] arr = {10 , 27 , 30 , 44 , 56 , 69 , 77 , 90 , 100};
        int ans = search(arr , 56 , 0  , arr.length - 1);
        System.out.println(ans);
    }
    static int search(int[] arr , int target , int start , int end){
//        int start = 0;
//        int end = arr.length - 1
           if(start > end){
               return -1;
           }
           int mid = start + (end - start)/2;
           if(arr[mid] == target){
               return mid;
           }else if(target > arr[mid]){
               //start = mid + 1;
              return  search(arr , target , mid + 1 , end);
           }else{
               //end = mid - 1;
               return search(arr , target , start , mid - 1 );
           }
    }
}
