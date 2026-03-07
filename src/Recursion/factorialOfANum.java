package Recursion;

public class factorialOfANum {
    static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        int prod;
        if(n == 0 || n==1){
            return 1;
        }
        return n*factorial(n-1);

    }
}
