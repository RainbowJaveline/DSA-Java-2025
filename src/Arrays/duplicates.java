package Arrays;

import java.util.ArrayList;

public class duplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            for(int j = 1; j < nums.length  ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count>0){
                list.add(nums[i]);
            }
        }
        return list.size();
    }
}
