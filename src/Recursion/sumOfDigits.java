package Recursion;

public class sumOfDigits {
    static void main(String[] args) {
        System.out.println(digitsSum(2));
    }
    static int digitsSum(int n){
        if(n <= 9){
            return 0;
        }
        return n%10 + digitsSum(n/10);
    }
}
