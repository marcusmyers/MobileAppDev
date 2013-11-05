## Chapter 6.6 - Logical Operators

[Back](../README.md)

There are three logical operators in Java: AND, OR and NOT, which are denoted by the symbols ``&&``, ``||`` and ``!``

For example:

``x > 0 && x < 10`` is true only if x is greater than zero AND less than 10.

``evenFlag || n%3 == 0`` is true if either of the conditions is true, that is, if evenFlag is true OR the number is divisible by 3.


Finally, the NOT operator inverts a boolean expression, so ``!evenFlag`` is true if evenFlag is false—if the number is odd.


Logical operators can simplify nested conditional statements. For example, can you re-write this code using a single conditional?
```java
if (x > 0) {
  if (x < 10) {
    System.out.println("x is a positive single digit.");
  }
}
```
