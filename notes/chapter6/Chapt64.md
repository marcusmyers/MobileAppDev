## Chapter 6.4 Notes - Overloading

In the previous section, [Chapter 6.3](./Chapter63.md), you may notice that ```circleArea``` 
and ```area``` perform similar functions - finding the area of a circle - but take different 
parameters.  For ```area``` we had to pass in the radius; for ```circleArea``` we provided two
points.

For example:

```java
// Method: area
// Parameters: double radius
// Desc:  Calculates the area of a circle given the radius
//        returns the area circle
// Return type: double
public static double area(double radius) {
    return Math.PI * radius * radius;
}

// Method: area
// Parameters: double x1, double y1, double x2, double y2
// Desc:  Calculates teh area of a circle given to points
//        returns the area of the circle
// Return type: double
public static double area(double x1, double y1, double x2, double y2) {
    return area(distance(xc, yc, xp, yp));
}

```


When you invoke an overloaded method, Java knows which version you want by looking at the arguments that you provide. If you write:
```java 
double x = area(3.0);
```
Java goes looking for a method named area that takes one double as an argument, and so it uses the first version, which interprets the argument as a radius. If you write:
```java
double x = area(1.0, 2.0, 4.0, 6.0);
```
Java uses the second version of area. And notice that the second version of
area actually invokes the first.
