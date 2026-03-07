package BinarySearch;

public class rotationCountOfArr {
    static void main(String[] args) {
//        int[] nums = { 15 , 18 , 2 , 3 , 6 , 12};
        int[] nums = { 4,5,6,7,0,1,2};
        int pivot = pivotSearch(nums);
        System.out.println(nums[pivot]);
        int count = pivot + 1;
        System.out.println(count);
    }
    static int pivotSearch(int[] nums){
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
}
