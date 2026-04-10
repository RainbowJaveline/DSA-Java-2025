package ArrayDSA.SlidingWindow;
//Maximum Sum Subarray of Size K (easy)
//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class maxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println(maxSumwithK(arr,k));
    }

    static int maxSumwithK(int[] arr , int k){
                int n = arr.length;
                int low = 0;
                int high = k - 1;
                int sum = 0;
                // Step 1: First window
                for(int i = low; i <= high; i++){
                    sum += arr[i];
                }
                int ans = sum;
                // Step 2: Slide window
                while(high < n){
                    low++;
                    high++;
                    if(high == n) break;
                    sum = sum - arr[low-1] + arr[high];
                    ans = Math.max(sum , ans);

                }
                return ans;
    }
}
