class Countdown {

  public static void main(String[] args)
  {
    double r = 6.0;
    countdown(99);
    double a = area(r);
    System.out.println("The area of the circle is: " + a);
  }

  public static void countdown(int x)
  {
    if(x == 0){
      System.out.println("Blastoff!!"); 
    } else {
      System.out.println(x);
      countdown(x-1); 
    }
  }

  public static double area(double radius)
  {
     double area = Math.PI * radius * radius;
     return area;
  }

}

  
