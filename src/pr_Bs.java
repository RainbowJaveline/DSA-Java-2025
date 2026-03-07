import java.util.Arrays;

public class pr_Bs {
    public static void main(String[] args) {
        int[] arr = {20 , 42 , 51 , 77 , 99 , 100};
        int[] arr1 = {2 , 3 , 5 , 9 , 14 , 16 , 18};
        char[] arr2 = {'a' , 'b'};
        int[] arr3 = {2 , 7, 7, 7, 7 ,8 , 8 , 10};
        int target = 15;
        int target2 = 7;
        int[] infiniteArray = {3, 7, 12, 18, 24, 29, 35, 41, 46, 52, 58, 61, 67, 72, 78, 83, 88, 91, 95, 99};
        int[] arr4 = {2 , 3 , 5 , 6 , 4 , 3 , 2 , 1 };
        int[] arr5 = {1, 2 , 5, 6, 7, 0 , 2 , 3};
//        int ans = search(arr , target);
//        System.out.println(ans);
        int ans2 = ceilingOfANumber(arr , target);
        System.out.println(ans2);
        int ans3 = floorOfANumber(arr1 , target);
        System.out.println(ans3);
        int ans4 = smallestLetterGreaterThanTarget(arr2 , target);
        System.out.println(ans4);
        int[] ans5 = firstAndLastPos(arr3 , target2);
        System.out.println(Arrays.toString(ans5));
        int start = 0;
        int end = 5;
        int target3 = 91;
        int ans6 = searchInfiniteArray(infiniteArray , target3 , start , end);
        while(ans6 == -1){
            start = end;
            end = 2*start;
            ans6 = searchInfiniteArray(infiniteArray , target3 , end , 2*end);
        }
        System.out.println(ans6);

        System.out.println(peakInAMountainIndex(arr4));

        int ans7 = binarySearchInRBS(arr5 , 3);
        System.out.println(ans7);
    }

    //1/ . Normal Binary search
    static int search(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    //2. Ceiling of a NUmber - Smallest Number greater than or equal to the target
    // this problem in the striver sheet is named as lower bound
    static int ceilingOfANumber(int[] arr , int target){
        int start = 0 ;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    //3. Floor of a Number
    static int floorOfANumber(int[] arr ,int target){
        int start = 0 ;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start - 1 ;
    }
    static int smallestLetterGreaterThanTarget(char[] arr ,int target){
        int start = 0 ;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return arr[start % arr.length] ;
    }
    static int[] firstAndLastPos(int[] arr , int target2){
        int[] ans = {-1 , -1 };
        int firstOcc = search2(arr , target2 , true);
        int lastOcc = search2(arr , target2 , false);
        if(firstOcc == -1 && lastOcc == -1){
            return ans;
        }
        return new int[]{firstOcc , lastOcc};
    }
    static int search2(int[] arr , int target2 , boolean findFirstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target2 == arr[mid]){
                ans = mid;
                if(findFirstIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            }else if (target2 < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    //6. position of an element in an infinite array
    static int searchInfiniteArray(int[] arr , int target , int start , int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    //7. peak in a mountain index
    static int peakInAMountainIndex(int[] arr ){
        int start = 0;
        int end = arr.length - 1;
        while(start < end ){
            int mid = start + ( end - start )/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return arr[start] ;
    }

    static int pivotInRBS(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + ( end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] <= arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1 ;
    }
    static int binarySearchInRBS(int[] arr , int target){
        int pivot = pivotInRBS(arr);
        if(target <= arr[0]){
            return searchInfiniteArray(arr , target , pivot+1 , arr.length - 1);
        }else{
            return searchInfiniteArray(arr , target , 0 , pivot);
        }
    }

}


