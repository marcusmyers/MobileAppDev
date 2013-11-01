class Countdown {

  public static void main(String[] args)
  {
    double r = 6.0;
 //   countdown(99);
    double a = area(r);
    double dist = distance(1.0, 2.0, 4.0, 6.0);
    System.out.println("Distance equals " + dist);
//    System.out.println("The area of the circle is: " + a);
//    System.out.println("The absolute value of -6.0 is " + absoluteValue(-6.0));
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
     return Math.PI * radius * radius;
  }

  public static double distance(double x1, double y1, double x2, double y2)
  {
     double dx = x2 - x1;
     double dy = y2 - y1;
     double dsquared = dx*dx + dy*dy;
     return Math.sqrt(dsquared);
  }

  public static double absoluteValue(double x) 
  {
     if(x < 0) {
        return -x;
     } else {
        return x;
     }
  }  

}

  
