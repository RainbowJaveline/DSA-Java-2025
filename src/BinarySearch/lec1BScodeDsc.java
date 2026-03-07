package BinarySearch;

import java.util.Scanner;

public class lec1BScodeDsc {
    public static void main(String[] args) {
//        int[] arr = {10 , 27 , 30 , 44 , 56 , 69 , 77 , 90 , 100};
        int[] arr= {100 , 90 , 77 , 69 , 56 , 44 , 30 , 27 , 10 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find: ");
        int target = sc.nextInt();
        //        int target = 30;
        int ans = search(arr , target);
        System.out.println("Element found at : "+ ans);
    }
    static int search (int[] arr , int target){
        int start = arr.length-1;
        int end = 0;
        while(end <= start){
            //int mid = (start+end)/2; // the mid formula ( start + end ) , this might exceed the vallue of int in java
            // better way to find mid
            int mid = end + (start - end)/2;
            if( target < arr[mid]){
                end = mid + 1;
            } else if( target > arr[mid]){
                start = mid - 1 ;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
