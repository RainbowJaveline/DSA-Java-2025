package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] infiniteArray = {3, 7, 12, 18, 24, 29, 35, 41, 46, 52, 58, 61, 67, 72, 78, 83, 88, 91, 95, 99};
        int target = 35;
        int ans = searchInfiniteArray(infiniteArray , target);
        System.out.println(ans);
    }
    static int searchInfiniteArray(int[] arr , int target){
        int start = 0;
        int end = 5;
        int ans = search(arr , target , start , end);
        while(ans == -1 ){
            start = end;
            end = 2*end;
            ans = search(arr , target , start , end );
        }
        return ans;
    }
    static int search(int[] arr , int target , int start , int end){
        while(start <= end ){
            int mid = start + (end - start)/ 2 ;
            if( target < arr[mid]){
                end = mid - 1;
            } else if( target > arr[mid]){
                start = mid + 1 ;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
