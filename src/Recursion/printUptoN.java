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
}
