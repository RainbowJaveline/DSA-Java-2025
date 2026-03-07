package BinarySearch;

public class splitArray {
    static void main(String[] args) {

    }
    static int splitArray1(int[] nums,int k){
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            start = Math.max(start , nums[i]);
            end+= nums[i];
        }
        //binary search
        while(start < end){
            int mid = start + (end - start)/2;
            int pieces = 1;
            int sum = 0;
            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;//here start is equal to end
    }
}
