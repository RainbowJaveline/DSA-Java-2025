package Recursion;

import org.w3c.dom.ls.LSOutput;

public class printUptoN {
    static void main(String[] args) {
        //Calling 1st method
        print1(1 , 20);
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
        System.out.println(aRaisedTob(2 , 3));
    }
    //Method 1 - This prints numbers from 1 to N using Recursion
    static void print1(int x , int n){
        if(x>n) return ;
        System.out.print(x + " ");
        print1(x+1 , n);
    }

    //Method 2 - This uses only one parameter to print upto N . It is based on the concept of CALLBACKS
    static void print2(int n ){
        if(n==0) return ;
        print2(n-1);
        System.out.print(n + " ");

    }
    //Method 3 - This Prints in reverse order .
    static void print3(int n ){
        if(n==0) return ;
        System.out.print(n + " ");
        print3(n-1);
    }

    // This is a completely new function that will use both the above concepts
    // Idea is to print decreasing-increasing numbers together
    //Example - n = 5
    //o/p - 5432112345
    static void decreasing_increasing(int n){
        if(n==0) return;
        System.out.print(n +" ");
        decreasing_increasing(n-1);
        System.out.print(n +" ");
    }

    //Factorial of a Number using Recursion
    static int factorialOfN(int n ){
        if(n==0) return 1;

        return factorialOfN(n-1) * n;
    }

    // a raised to the power of b
    static int aRaisedTob(int a , int b){
        if(b==1) return a;
        return a * aRaisedTob(a , b-1);
    }

}
