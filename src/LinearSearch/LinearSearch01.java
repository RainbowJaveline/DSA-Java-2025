package LinearSearch;

import java.util.Scanner;

public class LinearSearch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23 , 19 ,30 , 14 , 70 , 81};
        //int element = sc.nextInt();
        String str = "NealMudaliar";
        char target = 'u';
        System.out.println(search(str , target));
        System.out.println(search2(str , target));
        //searchingElementInArray(arr , element);
    }
    // Searching an Element from an array
//    static void searchingElementInArray(int[] arr , int element){
//        if(arr.length == 0){
//            return ;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(element == arr[i]){
//                System.out.println("Element found at Index : " +i);
//            }
//
//
//        }
        static boolean search(String name , char target){
            if(name.isEmpty()){
                return false;
            }
            for (int i = 0; i < name.length(); i++) {
                if (target == name.charAt(i)) {
                    return true;
                }
            }
            return false;
        }
    static boolean search2(String str , char target){
        for( char e : str.toCharArray()){
            if(target == e){
                return true;
            }
        }
        return false ;
    }

}
