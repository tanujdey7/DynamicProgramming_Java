public class GCD {
  static int gcd(int a , int b) {
    if(a == 0) {
      return b;
    }
    return gcd(b % a , a);
  }
  public static void main(String args[]) {
    System.out.print("GCD: "+gcd(15,10));
  }
}
