public class hcfOfNum {
    static void main(String[] args) {
        System.out.println(hcf(318,504));
    }
    static int hcf(int a , int b){
        int ans = 1;
        if(a==b) return a;
        int min = Math.min(a,b);
        for (int i = 1; i <= min ; i++) {
            if(a%i == 0 && b%i== 0){
                ans = i;
            }
        }
        return ans;

    }
}
