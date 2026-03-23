package Recursion.StringRec;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    static void main(String[] args) {
        String u = "abc";
        permutationRec("",u);
        System.out.println();
        //Method 2
        System.out.println(permutationRec2("" , u));

        //Method 3
        System.out.println(permutationRecCount("" , "abcd"));


        //Method 4 - Swapping logic
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        permutationSwap(arr , ans , 0);
        System.out.println(ans);
    }

    static void permutationRec(String p , String u){
        if(u.isEmpty()){
            System.out.println(p);
            return ;
        }

        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i);
            permutationRec(f+u.charAt(0)+l , u.substring(1));
        }
    }

    static ArrayList<String> permutationRec2(String p , String u){
        if(u.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i);
            ans.addAll(permutationRec2(f+u.charAt(0)+l , u.substring(1)));
        }

        return ans;
    }

    static int permutationRecCount(String p , String u){
        if(u.isEmpty()){
//            System.out.println(p);
            return 1;
        }
        int count = 0;
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i);
            count+= permutationRecCount(f+u.charAt(0)+l , u.substring(1));
        }

        return count;
    }

    //Swapping method for permutation
    static void permutationSwap(int[] arr , List<List<Integer>> ans , int idx){
        if(idx == arr.length) {
            List<Integer> list = new ArrayList<>();
            for (int i : arr) {
                list.add(i);
            }
            ans.add(new ArrayList<>(list));
            return ;
        }

        for (int i = idx; i < arr.length; i++) {
            swap(i,idx,arr);
            permutationSwap(arr,ans,idx+1);
            swap(i,idx,arr);
        }
    }

    static void swap(int i , int idx , int[] arr){
        int t = arr[i];
        arr[i] = arr[idx];
        arr[idx] = t;
    }
}
