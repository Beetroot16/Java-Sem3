class Mymath{
    static int power(int x, int y){
        int ans=1;
        for(int i=0;i<y;i++){
            ans = ans*x;
        }
        return ans;
    }
    static int factorial(int n){
        int ans = 1;
        while(n != 1){
            ans = ans*n;
            n--;
        }
        return ans;
    }
}

public class Exp2 {
    static int one(int x,int n){
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans = ans + (Mymath.power(x, n)/Mymath.factorial(n));
        }
        return ans;
    }
    static int two(int x,int n){
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans = ans +(((Mymath.factorial(n)/Mymath.factorial(n-i))*Mymath.power(n,i))/Mymath.factorial(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(one(1,5));
        System.out.println(two(5,1));
    }
}
