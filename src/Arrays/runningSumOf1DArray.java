package Arrays;

import java.sql.Array;
import java.util.Arrays;

public class runningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = { 1 , 2 , 3 , 4 };
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
        int[] arr1 = {1 , 2 , 3};
        int[] arr2 = {1 , 2 , 3 };


    }

    static int[] runningSum(int[] nums) {
//        int[] num = new int[nums.length];
//        num[0] = nums[0];
        for(int i = 0 ; i < nums.length - 1 ; i++ ){
            nums[i+ 1] = nums[i] + nums[i + 1];
        }
        return nums;
    }
}


