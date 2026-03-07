package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class rotateByK {
    static void main(String[] args) {
        int[] nums = {1 , 2, 3 ,4 ,5 ,6 ,7};
        int n = nums.length;
        int k = 3;
        k = k%n;
        // reverse the whole array
        reverse(nums , 0 , n - 1);
        // reverse upto k
        reverse(nums , 0 , k-1);
        //reverse from k+1 to n-1
        reverse(nums , k , n - 1);
        System.out.println(Arrays.toString(nums));


    }
    static void reverse(int[] nums , int i , int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
