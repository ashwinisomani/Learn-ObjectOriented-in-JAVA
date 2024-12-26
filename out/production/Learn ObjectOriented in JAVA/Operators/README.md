# Java Operators Demo

## Overview
This project demonstrates the usage of various **Java Operators**, including:

1. **Arithmetic Operators**
2. **Relational Operators**
3. **Logical Operators**
4. **Bitwise Operators**
5. **Assignment Operators**
6. **Unary Operators**
7. **Ternary Operator**
8. **Shift Operators**

Each category includes a theoretical explanation and examples implemented in Java.

---

## 1. **Arithmetic Operators**
Arithmetic operators are used to perform basic mathematical operations such as addition, subtraction, multiplication, division, and modulus.

| Operator | Description           | Example  |
|----------|-----------------------|----------|
| `+`      | Addition              | `a + b`  |
| `-`      | Subtraction           | `a - b`  |
| `*`      | Multiplication        | `a * b`  |
| `/`      | Division              | `a / b`  |
| `%`      | Modulus (Remainder)   | `a % b`  |

**Example**:  
If `a = 10` and `b = 5`, then:  
`a + b = 15`, `a - b = 5`, `a * b = 50`, `a / b = 2`, `a % b = 0`.

---

## 2. **Relational Operators**
Relational operators are used to compare two values. They return a boolean result (`true` or `false`).

| Operator | Description                 | Example   |
|----------|-----------------------------|-----------|
| `==`     | Equal to                    | `a == b`  |
| `!=`     | Not equal to                | `a != b`  |
| `>`      | Greater than                | `a > b`   |
| `<`      | Less than                   | `a < b`   |
| `>=`     | Greater than or equal to    | `a >= b`  |
| `<=`     | Less than or equal to       | `a <= b`  |

**Example**:  
If `a = 10` and `b = 5`, then:  
`a > b` is `true`, `a < b` is `false`, `a == b` is `false`.

---

## 3. **Logical Operators**
Logical operators are used to perform logical operations, usually with boolean values.

| Operator | Description          | Example       |
|----------|----------------------|---------------|
| `&&`     | Logical AND          | `x && y`      |
| `||`     | Logical OR           | `x || y`      |
| `!`      | Logical NOT          | `!x`          |

**Example**:  
If `x = true` and `y = false`, then:  
`x && y` is `false`, `x || y` is `true`, `!x` is `false`.

---

## 4. **Bitwise Operators**
Bitwise operators perform operations at the bit level. They are applied to integers.

| Operator | Description           | Example       |
|----------|-----------------------|---------------|
| `&`      | Bitwise AND           | `a & b`       |
| `|`      | Bitwise OR            | `a | b`       |
| `^`      | Bitwise XOR           | `a ^ b`       |
| `~`      | Bitwise NOT           | `~a`          |

**Example**:  
If `a = 5` (0101 in binary) and `b = 3` (0011 in binary), then:
- `a & b` = `1`  (0001)
- `a | b` = `7`  (0111)
- `a ^ b` = `6`  (0110)
- `~a` = `-6` (inverts all bits).

---

## 5. **Assignment Operators**
Assignment operators are used to assign values to variables.

| Operator | Description             | Example     |
|----------|-------------------------|-------------|
| `=`      | Assign value            | `a = 10`    |
| `+=`     | Add and assign           | `a += 5`    |
| `-=`     | Subtract and assign      | `a -= 5`    |
| `*=`     | Multiply and assign      | `a *= 5`    |
| `/=`     | Divide and assign        | `a /= 5`    |

**Example**:  
If `a = 10`, then:  
`a += 5` results in `a = 15`.

---

## 6. **Unary Operators**
Unary operators operate on a single operand.

| Operator | Description               | Example   |
|----------|---------------------------|-----------|
| `+`      | Unary plus (positive)     | `+a`      |
| `-`      | Unary minus (negative)    | `-a`      |
| `++`     | Increment                 | `++a`     |
| `--`     | Decrement                 | `--a`     |
| `!`      | Logical NOT               | `!x`      |

**Example**:  
If `a = 7`, then:  
`++a` is `8`, `--a` is `6`.

---

## 7. **Ternary Operator**
The ternary operator is a shorthand for an `if-else` statement.

**Syntax**:
```java
condition ? value1 : value2;
