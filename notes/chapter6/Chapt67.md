## Chapter 6.7 - Boolean Methods

[Back](../README.md)

Methods can return boolean values just like any other type, which is often convenient for hiding tests inside methods. For example:

```java
public static boolean isSingleDigit(int x) {
  if (x >= 0 && x < 10) {
      return true;
  } else {
      return false;
  }
}
```

Notice the name of the method, it is common to give boolean methods names that sound like yes/no questions.

Remember that the expression x >= 0 && x < 10 has type boolean, so there is nothing wrong with returning it directly and avoiding the if statement altogether:

```java
public static boolean isSingleDigit(int x) {
  return (x >= 0 && x < 10);
}
```

You would invoke the method just like any other method.

```java
boolean bigFlag = !isSingleDigit(17);
System.out.println((isSingleDigit(2));
```
