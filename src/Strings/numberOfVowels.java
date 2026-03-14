package Strings;

public class numberOfVowels {
    public static void main(String[] args) {
        String str ="neal";
        String str1 = str.toLowerCase();
        int count = 0;
        for (int i = 0; i <str1.length() ; i++) {
            char ch = str1.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count+=1;
            }
        }
        System.out.println(count);
        System.out.println(isPalindrome("NEAL"));
        changeString("HelloWorld");

        //Count digits in a number
        int num = 29384;
        String s = Integer.toString(num);
        System.out.println(s.length());

        String str3 = "     day";
        System.out.println("This is what i wanted :" + " "+ str3.trim().length());

        //Print all Substring
        allSubstring("gopi");

        //Sum of All substring
        System.out.println(sumOfAllSubString("6759"));

        //maximum occurrence in a string
        maxOccurrenceInAString();
    }
    static boolean isPalindrome(String str){
        String str1 = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            if(str1.charAt(start) == str1.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
    static void changeString(String str){
        //depending on the first letter convert the entire string to either upper or lower case
        if(Character.isLowerCase(str.charAt(0))){
            System.out.println(str.toLowerCase());
        }else{
            System.out.println(str.toUpperCase());
        }

    }
    static void allSubstring(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length(); j++) {
                System.out.println(s.substring(i,j));
            }
//            System.out.println();
        }
    }

    //Sum of All Substring of a Number
    static int sumOfAllSubString(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length(); j++) {
                sum+= Integer.parseInt(s.substring(i,j));// Integer.parseInt() is used to convert string to INT
            }
//            System.out.println();
        }
        return sum;
    }

    static void maxOccurrenceInAString(){
        //return the character that is most repeated inside a string
        //sample string
//        String s = "aaaeeeeffxxxxxx";
//        char[] arr = s.toCharArray();//this string is deliberately kept sorted because this the string should be sorted inorder for this method to work
//        int maxFreq = -1;
//        char ele = arr[0];
//        int i = 0;
//        int j = 0;
//        while(j<arr.length){
//            if(arr[i] == arr[j]){
//                j = j+1;
//            }else{
//                int count = j-i;
//                if(count > maxFreq){
//                    maxFreq = count;
//                    ele = arr[i];
//                }
//                i = j;
//            }
//
//
//        }
//        int count = j-i;
//        if(count > maxFreq){
//            maxFreq = count;
//            ele = arr[i];
//        }
//        System.out.println("Maximum :"+" "+ele);

        //Method2 - Using frequency array


    }

}
