package Recursion.StringRec;

import java.util.ArrayList;
import java.util.List;

public class combination1 {
    static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 7};
        int target = 7;
        System.out.println(combinationRec(arr , target));

    }

    static void combi1(int[] arr, int idx, int target, List<List<Integer>> ans, ArrayList<Integer> list) {
        if (idx == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if (target >= arr[idx]) {
            list.add(arr[idx]);
            combi1(arr, idx, target - arr[idx], ans, list);
            list.remove(list.size() - 1);
        }
        combi1(arr, idx + 1, target, ans, list);
    }

    static List<List<Integer>> combinationRec(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        combi1(arr, 0,target, ans, new ArrayList<>());
        return ans;
    }
}
