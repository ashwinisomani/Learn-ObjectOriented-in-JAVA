# Control Flow in Java

This document explains control flow statements in Java, focusing on `if`, `if-else`, and `if-else-if` constructs. It includes examples and scenarios for each.

## Control Flow Statements

Control flow statements determine the flow of execution in a program based on conditions.

### 1. **`if` Statement**

The `if` statement evaluates a condition and executes a block of code if the condition is `true`.

#### Syntax:
```java
if (condition) {
    // Code to execute if condition is true
}
``````


### 2. **`if-else` Statement**

The if-else statement provides two paths for execution: one if the condition is true and another if it is false.
#### Syntax:

```java
if (condition) {
    // Code to execute if condition is true
else{
    // Code to execute if condition is false
}
```````

### 3. ** Multiple `if` Statement**

When there are multiple independent conditions, you can use several if statements. Each if is evaluated separately, and multiple blocks can execute if their conditions are true.


#### Syntax:
```java
if (condition1) {
        // Code to execute if condition1 is true
        }
        if (condition2) {
        // Code to execute if condition2 is true
        }
        if (condition3) {
        // Code to execute if condition3 is true
        }
```````

### 4. **  `if-else-if` Ladder**

The if-else-if ladder is used when you need to evaluate multiple mutually exclusive conditions. Only one block is executed based on the first true condition.

#### Syntax:
```java
if (condition1) {
        // Code to execute if condition1 is true
        } else if (condition2) {
        // Code to execute if condition2 is true
        } else if (condition3) {
        // Code to execute if condition3 is true
        } else {
        // Code to execute if none of the above conditions are true
        }
```````

