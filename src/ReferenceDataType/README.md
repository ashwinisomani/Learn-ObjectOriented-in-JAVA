# Java Data Types: Primitive vs Non-Primitive

In Java, there are two categories of data types:

1. **Primitive Data Types**
2. **Non-Primitive (Reference) Data Types**

This document explains **non-primitive data types**, their characteristics, and how they differ from **primitive data types** in Java.

## 1. Non-Primitive Data Types (Reference Types)

Non-primitive data types are also known as **reference types**. These types are more complex than primitive types and are used to store references (memory addresses) to objects. Unlike primitive types, which store the actual value, non-primitive types store a reference (or pointer) to the memory location where the object is stored.

### Characteristics of Non-Primitive Data Types:
- **Not Predefined:** Non-primitive data types are defined by the programmer. They are typically created using classes, arrays, or String.
- **Can Store Complex Data:** Non-primitive types can store multiple values or more complex structures (such as objects and arrays).
- **Store References:** They store a reference (memory address) pointing to the actual data (object or array).
- **Nullability:** Non-primitive types can hold a `null` value, which indicates that they don't reference any object.
- **Size Depends on the Object:** The size of a non-primitive data type depends on the size of the object it references, unlike primitive types, which have a fixed size.

### Types of Non-Primitive Data Types

#### 1. **Classes**
- A class is a blueprint for creating objects. An object is an instance of a class, and it can hold multiple attributes (fields) and behaviors (methods).
- Example: `String`, `Person`, `Car`, etc.

#### 2. **Arrays**
- Arrays are a special kind of object that holds multiple values of the same type. Arrays are indexed collections of elements.
- Example: `int[]`, `String[]`, `Employee[]`, etc.

#### 3. **Strings**
- `String` is a special reference type used to represent sequences of characters. In Java, strings are immutable, meaning that once created, their values cannot be modified.
- Example: `"Hello, World!"`