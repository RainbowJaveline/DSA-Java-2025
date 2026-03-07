package Recursion;

public class fibonacciNum {
    public static void main(String[] args) {
        System.out.print(printFibNum(5));
    }
    static int printFibNum(int n){
      if( n < 2){
          return n;
      }
      return printFibNum(n - 1)+ printFibNum(n-2);
    }
}
