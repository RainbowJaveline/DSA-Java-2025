package SortingAlgos;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
    int[] arr = {5 , 3 , 4 , 1 , 2};
        System.out.println(Arrays.toString(insertion(arr)));
    }
    static int[] insertion(int[] arr){
        int n = arr.length;
        for (int i = 0; i <= n-2; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
}
