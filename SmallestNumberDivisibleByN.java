public class SmallestNumberDivisibleByN {
  static int gcd(int a , int b) {
    if(a == 0) {
      return b;
    }
    return gcd(b % a , a);
  } 
  static int lcm(int a) {
    int ans = 1;
    for(int i = 1 ; i <= a; i++) {
      ans = (ans * i) / gcd (ans , i);
    }
    return ans;
  }
  public static void main(String args[]) {
    System.out.println(lcm(10));
  }
}
