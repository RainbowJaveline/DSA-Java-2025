package BinarySearch;

public class peakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0 , 1 , 2 , 3 , 1 , 0};
//        int[] arr = {0,2,1,0};
//        int[] arr = {0,10,5,2};
        System.out.println(searchPeak(arr));
    }
    static int searchPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if( arr[mid] < arr[mid+1]){
                start = mid + 1;
            }else{
                end = mid  ;
            }
        }
        return start;
    }

}
