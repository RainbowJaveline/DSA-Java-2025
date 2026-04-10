package ArrayDSA.SlidingWindow;

import java.util.HashMap;

//Link - https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
public class LongestSubstring {
    static void main(String[] args) {
        String s = "aabacbebebe";
        char[] str = s.toCharArray();
        int k = 3;
        System.out.println(longestSubstringWithKDistinct(str , k));
    }


    static int longestSubstringWithKDistinct(char[] str , int k){
        HashMap<Character , Integer> map = new HashMap<>();
        int l = 0 ;
        int res = 0;
        for(int h = 0 ; h<str.length ; h++){
            map.put(str[h] , map.getOrDefault(str[h], 0) + 1);
            while(map.size() > k){
                map.put( str[l] , map.get(str[l]) - 1);
                if(map.get(str[l]) == 0){
                    map.remove(str[l]);
                }
                l++;
            }

            if(map.size() == k){
                int len = h - l + 1;
                res = Math.max(len , res);
            }
        }

        return res;
    }
}
