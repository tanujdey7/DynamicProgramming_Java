class Fibonacci {
  static int fib(int n) {
    if(n <= 1) {
      return n;
    }
    return fib(n-1) + fib(n-2);
  }
  public static void main(String a[]) {
    int n = 10;
    System.out.println(fib(n));
  }
}
