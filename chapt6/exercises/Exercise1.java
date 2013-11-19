class Exercise1 {

  public static void main(String[] args)
  {
    // Call isDivisible() method here
    System.out.println(isDivisible(6, 7));
  }

  public static boolean isDivisible(int n, int m)
  {
    return ((n%m) == 0);
  }
}
