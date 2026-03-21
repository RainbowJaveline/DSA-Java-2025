package Recursion.Arrays;

public class arrayPrint {
    static void main(String[] args) {
        int[] arr = {3,4,6,12,46,80,55};
        int[] arr1 = {2 , 32 , 43 , 69 , 70 , 88 , 90};
        recPrint(arr,0);
        System.out.println();
        //FInd element in an array
        System.out.println(findEle(arr,0,69));
        //Binary search
        System.out.println(bsrecursion(arr,0,arr.length-1,43));
    }
    static void recPrint(int[] arr,int idx){
        int n = arr.length;
        if(idx == n) return ;
        //Prints original array
        System.out.print(arr[idx] + " ");
        recPrint(arr, idx+1);
        //To print reverse order of array
        //First recursively travel the array
        //Then print i.e just exchange line 18 and 19
    }

    static boolean findEle(int[] arr , int idx , int ele){
        int n = arr.length;
        if(idx == arr.length) return false;
        if(arr[idx] == ele) return true;
        return findEle(arr , idx+1 , ele);
    }
    static int bsrecursion(int[] arr , int start , int end , int ele){
        if(start>end) return -1;
        int mid = start + (end-start)/2;
        if(arr[mid] == ele) return mid;
        else if(arr[mid] > ele) return bsrecursion(arr,ele,start,mid-1);
        else return bsrecursion(arr,ele,mid+1,end);

    }
}
