package Recursion.Arrays;

import java.util.Arrays;

public class selectionSortII {
    static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionRecursion(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionRecursion(int[] arr , int r , int c , int maxIndex){
        if(r == 0) return ;

        if(c < r){
            if(arr[maxIndex] < arr[c]) {
                selectionRecursion(arr, r, c + 1, c);
            }else{
                selectionRecursion(arr,r,c+1,maxIndex);
            }
        }else{
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[r-1];
            arr[r-1] = temp;
            selectionRecursion(arr,r-1,0,0);
        }

    }
}
