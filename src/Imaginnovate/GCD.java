package Imaginnovate;

public class GCD {
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }

    public static void main(String[] args) {
        int n1=6;
        int n2=31;
        int result = gcd(n1,n2);
        System.out.println(result);
    }
}
