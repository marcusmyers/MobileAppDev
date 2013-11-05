## Chapter 6.5 - Boolean Expressions

Most of the operations we have seen produce results that are the same type as their operands. For example, the + operator takes two ints and produces an int, or two doubles and produces a double, etc.

The exceptions we have seen are the relational operators, which compare ints and floats and return either true or false. true and false are special values in Java, and together they make up a type called boolean. You might recall that when I defined a type, I said it was a set of values. In the case of ints, doubles and Strings, those sets are pretty big. For booleans, there are only two values.

```java
boolean flag; // assignment
flag = true;
boolean testResult = false; // initialization
```
