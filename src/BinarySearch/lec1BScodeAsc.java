package BinarySearch;

import java.util.Scanner;

public class lec1BScodeAsc {
    public void main(String[] args) {
        int[] arr = {10 , 27 , 30 , 44 , 56 , 69 , 77 , 90 , 100};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find: ");
        int target = sc.nextInt();
//        int target = 30;
        int ans = search(arr , target);
        System.out.println("Element found at : "+ ans);
    }

    static int search (int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            //int mid = (start+end)/2; // the mid formula ( start + end ) , this might exceed the vallue of int in java
            // better way to find mid
            int mid = start + (end - start)/2;
            if( target < arr[mid]){
                end = mid - 1;
            } else if( target > arr[mid]){
                start = mid + 1 ;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
