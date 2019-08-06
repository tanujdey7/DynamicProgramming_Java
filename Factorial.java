public class Factorial {
    static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            //n! = n * (n-1)!
            return (n * fact(n-1));
        }
    }
    public static void main (String[] args) {
        int n = 10;
        System.out.print("fact:"+fact(n));
    }
}