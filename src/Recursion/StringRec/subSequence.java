package Recursion.StringRec;

import java.util.ArrayList;

public class subSequence {

    static void main(String[] args) {
        subSqe("" , "abc");
        //method 2
        System.out.println(subSeq2("" , "abc"));

        int[] arr = {3,1,2};
        subSeq3( arr,new ArrayList<>() , 0);
        System.out.println();
        int[] arr2 = {1,1,2};
        subSeq4(arr2,new ArrayList<>() , 0 , 0 , 2 );
        System.out.println();
        subSeq5(arr2,new ArrayList<>() , 0 , 0 , 2 );
        System.out.println();
        System.out.println(subSeq6(arr2,0,0,2));
    }


    static void subSqe(String ans , String str){
        if(str.isEmpty()){
            System.out.print(ans+" ");
            return ;
        }
        char ch = str.charAt(0);

        subSqe(ans + ch , str.substring(1));

        subSqe(ans , str.substring(1));

    }

    static ArrayList<String> subSeq2(String ans , String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> left =  subSeq2(ans + ch , str.substring(1));

        ArrayList<String> right = subSeq2(ans , str.substring(1));

        left.addAll(right);

        return left;
    }

    static void subSeq3(int[] arr , ArrayList<Integer> list , int i){
        if(i == arr.length) {
            System.out.println(list);
            return ;
        }
        list.add(arr[i]);
        subSeq3(arr , list , i+1);
        list.remove(list.size()-1); // removeLast() function removes the element added from the last call
        subSeq3(arr,list,i+1);
    }

    static void subSeq4(int[] arr , ArrayList<Integer> list , int i , int sum , int target){
        if(i == arr.length) {
            if(sum == target){
                System.out.println(list);
            }
            return ;
        }
        list.add(arr[i]);
        subSeq4(arr,list,i+1,sum+arr[i],target);
        list.remove(list.size()-1);
        subSeq4(arr,list,i+1,sum,target);
    }

    //This method prints only one subsequence
    static boolean subSeq5(int[] arr , ArrayList<Integer> list , int i , int sum , int target){
        if(i == arr.length) {
            if(sum == target){
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[i]);
        if(subSeq5(arr,list,i+1,sum+arr[i],target)) return true;
        list.remove(list.size()-1);
        if(subSeq5(arr,list,i+1,sum,target)) return true;

        return false;
    }

    //This method returns the count of subsequences equal to target
    static int subSeq6(int[] arr , int i , int sum , int target){
        if(i == arr.length) {
            if(sum == target){
//                System.out.println(list);
                return 1;
            }
            return 0;
        }

        int left = subSeq6(arr,i+1,sum+arr[i],target);
        int rigth = subSeq6(arr,i+1,sum,target);

        return left+rigth;
    }
}
