package Recursion.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class sumArrOfTriangle {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sumOfTri(arr);
    }
    static void sumOfTri(int[] arr){
        if(arr.length<1) return ;
        int[] arr1 = new int[arr.length-1];
        for (int i = 1; i < arr.length; i++) {
            arr1[i-1] = arr[i]+arr[i-1];
        }
        sumOfTri(arr1);

        System.out.println(Arrays.toString(arr));
    }


}
