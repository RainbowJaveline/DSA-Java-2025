package ArrayDSA;
import java.util.Arrays;

public class squaresOfSortedArray {
    static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println((int)Math.pow(nums[0],2 ));
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    static int[] sortedSquares(int[] nums) {
        for(int j = 0 ; j< nums.length ; j++){
            nums[j] = nums[j] * nums[j]; // aise cast karte hai chuitye
        }
        int min = nums[0];
        for(int i=0 ; i< nums.length;i++){
            if(nums[i+1] < min){
                int temp = min;
                min = nums[i+1];
                nums[i+1] = temp;
            }
        }
        return nums;
    }
}
