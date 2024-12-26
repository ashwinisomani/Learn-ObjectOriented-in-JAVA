# **Java Arrays: Overview, Types, and Examples**

An **array** in Java is a data structure that stores a fixed number of elements of the **same type** in contiguous memory. Arrays allow efficient access and manipulation of elements through indexing.

---

## **What is an Array?**

- An array is a **container** that holds a fixed number of elements of a specific data type.
- Arrays can store **primitive types** (e.g., `int`, `boolean`, `char`) and **objects** (e.g., `String`).
- Each element in an array is accessed using its **index**.
- **Indexing** in arrays starts from `0` (zero-based indexing).

---

## **Types of Arrays**

1. **Single-Dimensional Array**
    - A one-dimensional array is a list of elements stored in a linear sequence.
    - Syntax:
      ```java
      dataType[] arrayName = new dataType[size];
      ```

2. **Multi-Dimensional Array**
    - Multi-dimensional arrays store data in a table (2D) or higher dimensions.
    - Syntax:
      ```java
      dataType[][] arrayName = new dataType[rows][columns];
      ```

3. **Jagged Array**
    - A special type of multi-dimensional array where each row can have a different number of columns.
    - Syntax:
      ```java
      dataType[][] arrayName = new dataType[rows][];
      ```


