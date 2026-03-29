package ArrayDSA.SlidingWindow;

import com.sun.source.tree.WhileLoopTree;

public class minSizeSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int[] arr2 = {1,1,1,1,1,1,1,1};
        int target = 7;
        int target2 = 11;
        System.out.println(minSubArray(arr,target2));
        System.out.println();
       int[] arr3 = {1,2,2,3,3,4};
       System.out.println(removeDuplicates(arr3));
    }
    static int minSubArray(int[] arr , int target){
        int l = 0 , h = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while(h<arr.length){
            sum = sum+arr[h];
            while(sum >= target){
                int len = h - l + 1;
                ans = Math.min(len , ans);
                sum = sum - arr[l] ;
                l++;
            }
            h++;
        }
        if(ans == Integer.MAX_VALUE) return 0;
        else return ans;
        }

        static int removeDuplicates(int[] arr) {
            int i = 0;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] == arr[i]) {
                    arr[i] = arr[j];
                    i++;
                }
            }
            return i;
        }
    }


