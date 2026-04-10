package ArrayDSA.SlidingWindow;

import java.util.HashMap;

//link - https://leetcode.com/problems/fruit-into-baskets/
public class fruitsInBasket {
    static void main(String[] args) {
        int[] arr = {1 , 2 , 2};
        System.out.println(totalFruit(arr));
    }

    static int totalFruit(int[] fruits) {
        if(fruits.length == 1) return 1;
        HashMap<Integer , Integer> map = new HashMap<>();
        int l = 0 ;
        int res = 0;
        for(int h = 0 ; h<fruits.length ; h++){
            map.put(fruits[h] , map.getOrDefault(fruits[h], 0) + 1);
            while(map.size() > 2){
                map.put( fruits[l] , map.get(fruits[l]) - 1);
                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }
                l++;
            }

            //only change in this condition as compared to the longest substring wih k distinct characters
            if(map.size() <= 2){
                int len = h - l + 1;
                res = Math.max(len , res);
            }
        }

        return res;
    }
}
