public class mathDSA {
    static void main(String[] args) {
        evenodd(20);
        int[] arr = {1 , 2 , 4 , 2 , 6 , 1 , 4};
        System.out.println(SingleOccurence(arr));
        System.out.println(MagicNumber(7));
        System.out.println(numberOfDigits(10 , 2));
    }
    static void evenodd(int n){
        int ans = n & 1;
        if(ans == 1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }

    static int SingleOccurence(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
    static int MagicNumber(int n){
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            n = n >> 1;
            ans+= last*base;
            base = base*5;
        }
        return ans;
    }
    static int numberOfDigits(int n , int base){
        //thia function finds the number of digits for a number in base b (b = 10 , 2 , 6, 8)
        int ans = (int)(Math.log(n) / Math.log(base))+1; // time complexity = log(n)
        return ans;
    }

    static int sumOfRowsInPascalTri(int n){
        int ans = (int) Math.pow(2 , (n-1));
        return ans;
    }

}
