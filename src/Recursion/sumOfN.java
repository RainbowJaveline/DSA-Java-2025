package Recursion;

public class sumOfN {
    static void main(String[] args) {
        System.out.println(sum(0));
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }
}
