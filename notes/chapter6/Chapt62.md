## Chapter 6.2 Notes - Program Development

At this point you should be able to look at complete Java methods and tell what they do. But it may not be clear yet how to go about writing them. I am going to suggest a method called incremental development.

Lets take the following formula for instance.

![Distance](../images/distance.png "Distance")

Consider what a distance method would look like and start simple.

For example

```java
public static double distance()
{
  return 0.0;
}
```

After that start adding more functionality to the method and test.  See example of stepping through the process below.  Also please note use values that you already know the answer to while building your methods.

```java
public static double distance(double x1, double y1, double x2, double y2)
{
  return 0.0;
}
```

```java
public static double distance(double x1, double y1, double x2, double y2)
{
  double dx = x2 - x1;
  double dy = y2 - y1;
  return 0.0;
}
```

```java
public static double distance(double x1, double y1, double x2, double y2)
{
  double dx = x2 - x1;
  double dy = y2 - y1;
  System.out.println('X = '+dx);
  System.out.println('Y = '+dy);  
  return 0.0;
}
```

```java
public static double distance(double x1, double y1, double x2, double y2)
{
  double dx = x2 - x1;
  double dy = y2 - y1;
  double dsquared = dx*dx + dy*dy;
  System.out.println('dsquared equals' + dsquared);
  return 0.0;
}
```

```java
public static double distance(double x1, double y1, double x2, double y2)
{
  double dx = x2 - x1;
  double dy = y2 - y1;
  double dsquared = dx*dx + dy*dy;
  double result = Math.sqrt(dsquared);
  System.out.println("result equals" + result);
  return 0.0;
}
```

```java
public static double distance(double x1, double y1, double x2, double y2)
{
  double dx = x2 - x1;
  double dy = y2 - y1;
  double dsquared = dx*dx + dy*dy;
  double result = Math.sqrt(dsquared);
  return result;
}
```


