package SortingAlgos;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5 , 4 , 3 , 2 , 1};
        System.out.println(Arrays.toString(bubble(arr)));
    }
    static int[] bubble(int[] arr){
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < n-i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break; // this condition takes care when the array is already sorted
        }
        return arr;
    }
}
