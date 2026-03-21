package Recursion.Arrays;

import java.util.Arrays;

public class reverseArray {
    static void main(String[] args) {
        int[] arr = {3,4,6,12,46,80,55,90};
        System.out.println(Arrays.toString(reverse(arr,0,arr.length-1)));
    }
    static int[] reverse(int[] arr , int s , int e){
        if(s>=e) return arr;
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        return reverse(arr,s+1,e-1);
    }
}
