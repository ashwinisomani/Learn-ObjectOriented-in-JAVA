# Loops in Java

This document explains the different types of loops in Java. It covers the `for`, `while`, and `do-while` loops, providing examples and detailed explanations of their usage.

## Types of Loops in Java

In Java, loops allow you to execute a block of code multiple times based on a condition. There are three types of loops:

1. **While Loop**
2. **Do-While Loop**
3. **For Loop**

### 1. **While Loop**

The while loop is used when the number of iterations is not known in advance and the condition is checked before entering the loop. The loop will keep executing as long as the condition evaluates to true.
#### Syntax:
```java
while (condition) {
    // Code to execute
}
````

### 2. **For Loop**

The do-while loop is similar to the while loop, but the key difference is that the condition is checked after executing the loop body. This guarantees that the loop will execute at least once, regardless of the condition.
#### Syntax:
```java
do {
    // Code to execute
} while (condition);
`````

### 3. **For Loop**

The `for` loop is used when the number of iterations is known beforehand. It consists of three parts: initialization, condition, and increment/decrement. The loop runs until the condition becomes false.

#### Syntax:
```java
for (initialization; condition; increment/decrement) {
    // Code to execute
}
