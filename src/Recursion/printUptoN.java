package Recursion;

import org.w3c.dom.ls.LSOutput;

public class printUptoN {
    static void main(String[] args) {
        //Calling 1st method
        print1(1, 20);
        System.out.println();
        //Calling 2nd method
        print2(23);
        System.out.println();
        //Calling 3rd method
        print3(10);
        System.out.println();
        //Calling 4th method
        decreasing_increasing(5);
        System.out.println();
        //Calling FactorialOfN
        System.out.println(factorialOfN(5));
        //Calling a raised to b function
        System.out.println(aRaisedTob(2, 24));
        //Calling reverse function
        System.out.println(reverse(1234 , 0));
        //Calling hcf recursion function
        System.out.println(hcf(318 , 504));
        //Calling fibonacci recursion function
        System.out.println(fibo(10));
    }

    //Method 1 - This prints numbers from 1 to N using Recursion
    static void print1(int x, int n) {
        if (x > n) return;
        System.out.print(x + " ");
        print1(x + 1, n);
    }

    //Method 2 - This uses only one parameter to print upto N . It is based on the concept of CALLBACKS
    static void print2(int n) {
        if (n == 0) return;
        print2(n - 1);
        System.out.print(n + " ");

    }

    //Method 3 - This Prints in reverse order .
    static void print3(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        print3(n - 1);
    }

    // This is a completely new function that will use both the above concepts
    // Idea is to print decreasing-increasing numbers together
    //Example - n = 5
    //o/p - 5432112345
    static void decreasing_increasing(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        decreasing_increasing(n - 1);
        System.out.print(n + " ");
    }

    //Factorial of a Number using Recursion
    static int factorialOfN(int n) {
        if (n == 0) return 1;

        return factorialOfN(n - 1) * n;
    }

    // a raised to the power of b
    static int aRaisedTob(int a, int b) {
        //this two lines of codes have a time complexity of O(b) where b is the power
//        if(b==1) return a;
//        return a * aRaisedTob(a , b-1);

        //We have a better solution with time complexity of log(b)
        if (b == 1) return a;
        int call = aRaisedTob(a, b / 2);
        if (b % 2 == 0) {
            //return aRaisedTob(a , b/2) * aRaisedTob(a , b/2);  using same function twicw to do the operation is pathetic instead do the above thing
            return call * call;
        }
//        return a * aRaisedTob(a , b/2) * aRaisedTob(a , b/2);
        return a * call * call;
    }

    //Reverse of a number
    static int reverse(int n , int r) {
//        int r = 0;
//        while (n != 0) {
//            r = r * 10;
//            r = r + n % 10;
//            n = n / 10;
//        }
//        System.out.println(r);
        if(n==0) return r;
        return reverse(n/10 , r*10 + n%10 );
    }

    //HCF of a number
    static int hcf(int a , int b){
        //Time Complexity - O(log(max(a,b)))
        //The below method works but is time consuming so we will use recursion
//        int ans = 1;
//        if(a==b) return a;
//        int min = Math.min(a,b);
//        for (int i = 1; i <= min ; i++) {
//            if(a%i == 0 && b%i== 0){
//                ans = i;
//            }
//        }
//        return ans;
        if(a==0) return b;
        return hcf(b%a,a);
    }

    //Nth fibonacci number
    //Time Complexity - O(2^n)
    static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1) + fibo(n-2);
    }

    //70 Climbing stairs leetcode
    //This solution provides answer but time limit exceeded error is shown for large values
    //That's y we need to use DP(Dynamic Programming)
    static int climbStairs(int n) {
            if(n==1) return 1;
            if(n==2) return 2;
            return climbStairs(n-1)+climbStairs(n-2);
        }

}
