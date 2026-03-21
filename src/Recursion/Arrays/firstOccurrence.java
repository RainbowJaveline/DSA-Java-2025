package Recursion.Arrays;

import java.util.ArrayList;

public class firstOccurrence {
    static void main(String[] args) {
        int[] arr = {11 , 23 , 42 , 22 , 23 , 44 , 23 , 90};
        System.out.println(OccfromStart(arr,0,23));
        //Find the occurence from the last
        System.out.println(OccFromLast(arr , arr.length-1, 23));
        //Find all occurrences
//        findAllOcc(arr , 0 , 23);
//        System.out.println(list);
//        //Find all Occurrences part 2
//        findAllOcc2(arr,0,23, new ArrayList<>());
//        System.out.println(list);
        //Find all Occurrences part 3
        System.out.println( findAllOcc3(arr,0,23));
    }
    static int OccfromStart(int[] arr ,int idx, int target){
        if(idx == arr.length) return -1;
        if(arr[idx] == target) return idx;
        return OccfromStart(arr,idx+1,target);
    }

    static int OccFromLast(int[] arr ,int idx, int target){
        if(idx == -1) return -1;
        if(arr[idx] == target) return idx;
        return OccFromLast(arr,idx-1,target);
    }

    //Find All the indices where the target element has occurred
    static ArrayList<Integer> list = new ArrayList<>();
    static int findAllOcc(int[] arr ,int idx, int target){
        if(idx == arr.length) return -1;
        if(arr[idx] == target){
            list.add(idx);
        }
        return findAllOcc(arr,idx+1,target);
    }

    //Another way of finding all indices is by passing an Arraylist itself in the parameter
    static ArrayList<Integer> findAllOcc2(int[] arr , int idx , int target , ArrayList<Integer> list){
        if(idx == arr.length) return list;
        if(arr[idx] == target) {
            list.add(idx);
        }
        return findAllOcc2(arr , idx+1 , target , list );
    }

    //Another way of finding all indices without passing an Arraylist itself in the parameter
    static ArrayList<Integer> findAllOcc3(int[] arr , int idx , int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx == arr.length) return list;
        //this contains ans specific to that function call
        if(arr[idx] == target) {
            list.add(idx);
        }
        ArrayList<Integer> answerFromBelow =  findAllOcc3(arr , idx+1 , target);

        list.addAll(answerFromBelow);

        return list;
    }

}
