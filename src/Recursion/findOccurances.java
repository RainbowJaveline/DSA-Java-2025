package Recursion;

public class findOccurances {
    static void main(String[] args) {
        int[] arr = {11 , 23 , 42 , 22 , 23 , 44 , 23 , 90};
        int x = 121;
        System.out.println(digits(x));
        System.out.println(count(arr , 23));
    }
    static int count(int[] arr , int target){
        return helper(arr , 23 , 0 , 0);
    }
    static int helper(int[] arr , int target , int i , int count){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return count;
        }
        return helper(arr,target,i+1, count+1);
    }
    static int digits(int x){
        int count =  0;
        while(x !=0){
            x = x/10;
            count ++;
        }
        return count;
    }
}
