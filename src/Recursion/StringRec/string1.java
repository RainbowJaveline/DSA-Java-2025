package Recursion.StringRec;

public class string1 {
    static void main(String[] args) {
        String str = "baccab";
        char target = 'a';
        StringBuilder ans = new StringBuilder();
        charskipping(ans , str , target , 0);
        System.out.println(ans);

        //method 2 - skipString
//        String str2 = "bcdappleedd";
        System.out.println(skipString( "bcdappleedd", "apple"));
    }
    static void charskipping(StringBuilder ans , String str , char target , int i){
        //This function skips all the occurrences of the target char and return a new string which does not contain target char
        if(i == str.length()) return ;
        if(str.charAt(i) == target){
            charskipping(ans , str , target , i+1);
        }else{
            ans.append(str.charAt(i));
            charskipping(ans , str , target , i+1);
        }
    }

    static String skipString(String str , String target){
        //This method is an extension of charskipping , here it skips the entire string present in the given string
        if(str.isEmpty()) return "";


        if(str.startsWith(target)){
            return skipString(str.substring(target.length()) , target);
        }else{
            return str.charAt(0) + skipString(str.substring(1) , target);
        }
    }
}
