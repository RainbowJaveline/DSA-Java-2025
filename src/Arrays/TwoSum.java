package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] ans = twoSum(nums , target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] nums, int target) {
        for(int i =0; i< nums.length ; i++){
            int sum = 0;
            for(int j=i+1; j< nums.length   ; j++){
                sum = nums[i]+nums[j];
                if(sum == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
