package ArrayDSA.SlidingWindow;
//Maximum Sum Subarray of Size K (easy)
//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class maxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 1;
        System.out.println(maxSumwithK(arr,k));
    }

    static int maxSumwithK(int[] arr , int k){
                int n = arr.length;
                int sum = 0;
                // Step 1: First window
                for(int i = 0; i < k; i++){
                    sum += arr[i];
                }
                int ans = sum;
                // Step 2: Slide window
                for(int i = k; i < n; i++){
                    sum = sum - arr[i - k] + arr[i];
                    ans = Math.max(ans, sum);
                }
                return ans;
    }
}
