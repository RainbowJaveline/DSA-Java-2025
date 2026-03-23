package ArrayDSA;

public class removeDuplicates {
    static void main(String[] args) {
        int[] nums = {1,1,1,1,2,2,2,3,3};
        System.out.println(duplicates(nums));
        System.out.println();
    }
    static int duplicates(int[] nums){
        int i = 0;
        int unique = 1;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i]!=nums[j]){
                i++;
                unique++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
        }

        }
        return unique;
    }
}
