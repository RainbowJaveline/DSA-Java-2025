package Patterns;

public class pattern1 {
    static void main(String[] args) {
        pattern01(4);
        System.out.println();
        pattern02(4);
        System.out.println();
        pattern03(4);
        System.out.println();
        pattern04(5);
        System.out.println();
        pattern05(5);
        System.out.println();
//        pattern28(5);
        pattern06(5);
        System.out.println();
        pattern07(5);
        System.out.println();
        pattern08(5);
        System.out.println();
        pattern09(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
    }
    static void pattern01(int n){
        for (int i = 1; i <=n; i++) {
            for(int j=1 ; j <=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern02(int n){
        for (int i = 1; i <=n; i++) {
            for(int j=1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern03(int n){
        for (int i = 1; i <=n; i++) {
            for(int j=n ; j >=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern04(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=i ;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern05(int n){
        for (int i = 1; i <=2*n - 1 ; i++) {
            int totalRowsInCol = i > n ? 2*n - i - 1 : i;
                for(int j=1 ; j <=totalRowsInCol ; j++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    static void pattern06(int n){
        for (int i = 1; i <= n ; i++) {
            int spacesOf = n - i;
            for (int spaces = 1; spaces <= spacesOf; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern07(int n){
        for (int i = 1; i <= n ; i++) {
            for (int spaces = 0 ; spaces <= i-1 ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern08(int n){
        for (int i = 1; i <= n ; i++) {
            for (int spaces = 0 ; spaces <= n - i ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern09(int n){
        for (int i = 1; i <= n ; i++) {
            for (int spaces = 0 ; spaces <= i-1 ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 2*n - i ; j >= i  ; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int i = 1; i <= n ; i++) {
            for (int spaces = 1 ; spaces <= n - i ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i  ; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for (int i = 1; i <= n ; i++) {
            for (int spaces = 0 ; spaces < i - 1 ; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= n - i + 1  ; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();
        }
    }





//    static void pattern28(int n){
//        for (int i = 1; i <=2*n - 1 ; i++) {
//            int totalRowsInCol = i > n ? 2*n - i - 1 : i;
//            int noOfSpaces = n - totalRowsInCol  ;
//            for (int s = 1; s <= noOfSpaces ; s++) {
//                System.out.print(" ");
//            }
//
//            for(int j=1 ; j <=totalRowsInCol ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern30(int n){
//        for (int rows = 1; rows <= n ; rows++) {
//
//        }
//    }
}
