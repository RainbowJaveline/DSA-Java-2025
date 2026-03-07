package Recursion;


public class countZeros {
    static void main(String[] args) {
        System.out.println(count(102304));
    }
    static int count(int n){
        return helper(n , 0);
    }
    static int helper(int n , int c){
        if(n == 0){
            return c;
        }
        if(n%10 == 0){
            return helper(n/10 , c+1);
        }
           return  helper(n/10 , c);
    }
//    static int count(int n , int c){
//        if(n==0){
//            return 1;
//        }
//        if(n%10 == 0){
//            return count(n/10 , c+1);
//        }
//        return count(n/10 , c);
//    }
}
