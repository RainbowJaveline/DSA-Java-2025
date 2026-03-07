public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts = { {1,2,3},
                {5 , 0 , 0}
        };
        int maxValue = add(accounts);
        System.out.println("Richest Person Has Wealth : "+ maxValue);

    }
//Two approach for this particular question....
    //1st approach is very slow if the sout statement is implemented
    static int add(int[][] accounts){
        int sum = 0;
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            for(int j =0 ; j < accounts[i].length ; j++){
                sum += accounts[i][j];
            }
            if(sum > max){
                max = sum ;
            }
            System.out.println("Customer number " + i + " has wealth : "+ sum);
            sum = 0;
        }
        return max;
    }
    //2nd Approach is fast
    static int add1(int[][] accounts){
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j =0 ; j < accounts[i].length ; j++){
                sum += accounts[i][j];
            }
            max = Math.max(max , sum );
            // System.out.println("Customer number " + i + " has wealth : "+ sum);
            sum = 0;
        }
        return max;
    }

    }

