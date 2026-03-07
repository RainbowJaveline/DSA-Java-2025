package LinearSearch;

import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] twoDarr = {
                {1 ,20 ,40},
                {22 , 56 ,79 , 20},
                {39 , 44 , 50 , 70 } ,
                {99 , 100}
        } ;
        int target = 100;
        int[] ans = search2DArray1(twoDarr , target);
        System.out.println(Arrays.toString(ans));
//        System.out.println(search2DArray(twoDarr , target));
        System.out.println(min2DArray(twoDarr));
        System.out.println(max2DArray(twoDarr));
    }

    static int search2DArray(int[][] twoDarr , int target ){
        if(twoDarr.length == 0){
            return -1;
        }
        for (int i = 0; i < twoDarr.length; i++) {
            for(int j = 0 ; j < twoDarr[i].length ; j++){
                if(target == twoDarr[i][j]){
                    return twoDarr[i][j] ;
                }
            }

        }
        return -1;
    }

    static int min2DArray(int[][] twoDarr){
        int min = twoDarr[0][0];
        for (int i = 0; i < twoDarr.length; i++) {
            for(int j = 0 ; j < twoDarr[i].length ; j++){
                if(min > twoDarr[i][j]){
                    min = twoDarr[i][j];
                }
            }
        }
        return min;
    }

    static int max2DArray(int[][] twoDarr){
        int max = twoDarr[0][0];
        for (int i = 0; i < twoDarr.length; i++) {
            for(int j = 0 ; j < twoDarr[i].length ; j++){
                if(max < twoDarr[i][j]){
                    max = twoDarr[i][j];
                }
            }
        }
        return max;
    }

    static int[] search2DArray1(int[][] twoDarr , int target ){
        for (int i = 0; i < twoDarr.length; i++) {
            for(int j = 0 ; j < twoDarr[i].length ; j++){
                if(target == twoDarr[i][j]){
                    return new int[]{i , j} ;
                }
            }

        }
        return new int[]{-1 , -1};
    }



}
