package BinarySearch;

import java.util.Arrays;

public class FirstAndLastOcc {
    public static void main(String[] args) {
        int[] num = {5 , 7 , 7 , 7 , 7 , 8 , 9 , 10 };
        int target = 7;
        int[] ans = searchRange(num , target);
        System.out.println(Arrays.toString(ans)); // aise likhkna chaiye
    }

    static int[] searchRange(int[] num , int target ){
        int[] ans = {-1 , -1};
        int first = search(num , target , true);
        int last = search(num , target , false);
        if(first == - 1 && last == -1){
            return ans;
        }
        ans = new int[]{first, last};
        return ans;
    }

    static int search(int[] num , int target , boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = num.length - 1 ;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if( target < num[mid]){
                end = mid - 1 ;
            }else if(target > num[mid]){
                start = mid + 1 ;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid - 1 ;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
