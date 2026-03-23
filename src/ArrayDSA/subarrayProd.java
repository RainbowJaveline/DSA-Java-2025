package ArrayDSA;

public class subarrayProd {
    static void main(String[] args) {
        int[] nums = {10 , 5 , 2 , 7};
        int n = 100;
        System.out.println(prod(nums , n));
    }
    static int prod(int[] nums , int k){
        int n = nums.length;
        int i = 0;
        int j = 1;
        int prod = nums[i]*nums[j];
        int count = 0;
        while(i <= n){
           if(nums[i] < k){
               count++;
               i++;
               i = i%n;
           } else if (prod < k) {
               count++;
               i++;
               j++;
           }
        }
        return count;
    }

}
