# Java Data Types

In Java, data types specify the kind of data that a variable can hold. Java has two main categories of data types:

1. **Primitive Data Types**
2. **Reference Data Types**

## 1. Primitive Data Types

Primitive data types are the most basic data types in Java. They are predefined by the Java language and represent simple values. These types are not objects and hold the actual value directly in memory. They are more efficient in terms of performance and memory usage.

### List of Primitive Data Types

| **Data Type** | **Size**  | **Default Value** | **Description** |
|---------------|-----------|-------------------|-----------------|
| `byte`        | 1 byte    | 0                 | Used for saving memory when values are between -128 and 127. |
| `short`       | 2 bytes   | 0                 | Used for saving memory when values are between -32,768 and 32,767. |
| `int`         | 4 bytes   | 0                 | Default type for integer values. Can hold values from -2^31 to 2^31-1. |
| `long`        | 8 bytes   | 0L                | Used for larger integer values. Can hold values from -2^63 to 2^63-1. |
| `float`       | 4 bytes   | 0.0f              | Used for decimal values with less precision compared to `double`. |
| `double`      | 8 bytes   | 0.0d              | Used for decimal values with double precision. |
| `char`        | 2 bytes   | '\u0000'          | Used to store single characters (Unicode). |
| `boolean`     | 1 bit     | false             | Represents a logical value, either `true` or `false`. |