package SortingAlgos;

import java.util.Arrays;

public class selectionSort {
    static void main(String[] args) {
        int[] arr = {4 , 3 , 5 , 2 , 1};
        System.out.println(Arrays.toString(selection(arr)));
    }
    static int[] selection(int[] arr){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int first = max(arr , 0 , n-i);
            swap(arr , first , last);
        }
        return arr;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int max(int[] arr , int start , int end){
        int max = start;
        for (int i = 0; i < end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
