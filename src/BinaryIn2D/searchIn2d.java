package BinaryIn2D;

import java.util.Arrays;

public class searchIn2d {
    static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10,13,14,17}
        };
        System.out.println(Arrays.toString(search(matrix , 9)));
    }
    static int[] search(int[][] arr , int target){
        int r = 0;
        int c = arr.length - 1;
        while(r < arr.length && c >= 0){
            if(arr[r][c] == target){
                return new int[]{r , c};
            }
            if(arr[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1 , -1};
    }
}
