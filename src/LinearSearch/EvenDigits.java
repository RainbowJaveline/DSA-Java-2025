package LinearSearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/?envType=problem-list-v2&envId=array
public class EvenDigits {
    public static void main() {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if( even(nums[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    static int even(int i){
        int count = 0;
        while(i > 0){
            count++;
            i = i/10;
        }
        return count;
    }
}
