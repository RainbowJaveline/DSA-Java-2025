package Recursion;

public class findElement {
    static void main(String[] args) {
        int[] arr = {1 , 14 , 25 , 46 , 68 , 85 , 94 , 20};
        System.out.println(find(arr , 20 , 0));
        System.out.println(find1(arr , 68 , 0));
    }
    static int find(int[] arr , int target , int i){
        if(i == arr.length - 1){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }else{
            return find(arr , target , i+1);
        }

    }

    static boolean find1(int[] arr , int target , int i){
        if(i == arr.length - 1){
            return true;
        }
        return arr[i] == target || find1(arr , target , i+1);

    }
}
