package BinarySearch;

public class RBS {
    static void main(String[] args) {
        int[] arr = { 2 , 3 , 4 , 5 , 6 , 0 , 2, 1};
        int target = 3;
        int pivot = searchPivot(arr);
//        System.out.println(pivot);
        int ans = search(target , arr);
        if(ans!= -1){
            System.out.println(ans);
        }else{
            System.out.println("element not found");
        }

    }
    static int search(int target , int[] nums){
        int pivot = searchPivot(nums);
        if(pivot == -1){
            return search1(nums , target , 0 , nums.length - 1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0] ){
           return search1(nums , target , 0 , pivot - 1);
        }else{
            return search1(nums , target , pivot + 1 , nums.length - 1);
        }
    }
    static int searchPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int search1 (int[] nums , int target , int start , int end){
//        int start = 0;
//        int end = nums.length-1;
        while(start <= end){
            //int mid = (start+end)/2; // the mid formula ( start + end ) , this might exceed the vallue of int in java
            // better way to find mid
            int mid = start + (end - start)/2;
            if( target < nums[mid]){
                end = mid - 1;
            } else if( target > nums[mid]){
                start = mid + 1 ;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
