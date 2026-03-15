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
}
