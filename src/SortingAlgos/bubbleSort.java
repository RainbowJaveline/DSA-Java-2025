package SortingAlgos;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
//        int[] arr = {5 , 4 , 1 , 3 , 2 };
//        int[] arr = {42, 7, 19, 3, 88, 25, 61, 14, 9, 50};
//        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
//        int[] arr = {12, -7, 45, 0, -23, 8, 19, -3, 27, -15};
          int[] arr = {34, 7, 89, 12, 56, 23, 90, 1, 45, 67, 3, 78, 21, 54, 10, 99, 6, 38, 72, 15};

        System.out.println(Arrays.toString(bubbleSort1(arr)));
    }
    static int[] bubbleSort1(int[] arr){
        boolean swapped;
        for(int i=0 ; i< arr.length-1; i++){
            swapped = false ;
            for(int j=1 ; j<arr.length-i ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true ;
                }
            }
            if(!swapped){
                return arr;
            }
        }
        return arr;
    }
}
