// Chapter 6 - Exercise 6.2
class MultAdd {

  public static void main(String[] args)
  {
    double x = multadd(1.0, 2.0, 3.0);
    System.out.println("5 =="+ x);
    System.out.println(multadd(Math.sin(Math.PI/4),(Math.cos(Math.PI/4)/2)));
    System.out.println(multadd(Math.log(10), Math.log(20)));
  }  

  public static double multadd(double a, double b, double c)
  {
    return a*b + c;
  }

  public static double multadd(double a, double b)
  {
	return a + b;
  }

  public static void yikes(double d)
  {
//    Math.sin();
//    Math.cos();
//    Math.log();
//    Math.PI;
  }
}
