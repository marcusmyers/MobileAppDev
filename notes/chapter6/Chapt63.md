## Chapter 6.3 Notes - Composition

[Back](../README.md)


Once you define a new method, you can use it as part of an expression, and you can build new methods using existing methods.

What if someone gave you two points, the center of the circle and point on the perimeter, and asked for the area of the circle?

We have a method, distance that gives us the "distance" between 2 points.

```java
double radius = distance(xc, yc, xp, yp);
```

The second step is to find the area of a circle wit that radius, and return it.

```java
double area = area(radius);
return area;
```
