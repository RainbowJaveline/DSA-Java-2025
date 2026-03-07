package LinearSearch;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {12 , 13 , 20 , 25 , 40 , 55 , 70};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i] ){
                min = arr[i];

            }

        }
        return min;
    }

    static int max(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(max < i){
                max = i;
            }
        }
        return max;
    }

}
