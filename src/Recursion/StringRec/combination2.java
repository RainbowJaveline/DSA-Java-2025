package Recursion.StringRec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination2 {
    static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;

        System.out.println(combinationRec2(arr , target));
    }

    static void combi2(int[] arr, int idx, int target, List<List<Integer>> ans, ArrayList<Integer> list) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));
                return;
            }

        for(int i = idx; i < arr.length; i++) {
            if(i>idx && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            list.add(arr[i]);
            combi2(arr, i+1, target - arr[i], ans, list);
            list.remove(list.size() - 1);
        }
    }

    static List<List<Integer>> combinationRec2(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        combi2(arr, 0,target, ans, new ArrayList<>());
        return ans;
    }
}
