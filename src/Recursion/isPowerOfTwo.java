package Recursion;
// Link to Question - https://leetcode.com/problems/power-of-two/
public class isPowerOfTwo {
    static void main(String[] args) {
        System.out.println(poweroftwo(9));
    }
    static boolean poweroftwo(int n){
        if(n<=0) return false;
        return helper(n);

        //Fastest solution
//    class Solution {
//        public boolean isPowerOfTwo(int n) {
//            return n > 0 && (n & (n - 1)) == 0;
//        }
//    }
    }

    static boolean helper(int n){
        if(n==1) return true;
        if(n%2!=0) return false;
        return helper(n/2);
    }

    //Power of Three
    static boolean powerofThree(int n){
        if(n<=0) return false;
        if(n==1) return true;
        if(n%3!=0) return false;
        return powerofThree(n/3);

        //More optimized solution
//        public boolean isPowerOfThree(int n) {
//            double t=Math.cbrt(n);
//            // if(n==1){
//            //     return true;
//            // }
//            for(int i=0;i<=t;i++){
//                double r=Math.pow(3,i);
//                if(r==n){
//                    return true;
//                }
//
//            }
//            return false;
//        }
    }


}

