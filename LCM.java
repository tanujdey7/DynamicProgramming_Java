//Least Common Multiplier
public class LCM {
  static int gcd(int a , int b) {
    if(a == 0) {
      return b;
    }
    return gcd(b % a , a );
  }
  static int lcm(int a , int b) {
    return (a*b)/gcd(a , b);
  }
  public static void main(String args[]) {
    System.out.println("LCM: "+lcm(15,10));
  }
}
