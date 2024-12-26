# String Operations in Java

## What is a String?
In Java, a **String** is a sequence of characters, represented as an object. Strings are immutable, meaning once created, their value cannot be changed. Java provides the `String` class for handling and manipulating strings.

A string can be created in two main ways:
1. **String Literal:** Allocated in the string pool.
   ```java
   String str = "Hello";
   ```
2. **Using the `new` Keyword:** Allocated in the heap memory.
   ```java
   String str = new String("Hello");
   ```

---

## Common String Operations
Here are the essential operations and methods used with strings in Java:

### 1. String Creation
- **Using Literals:**
   ```java
   String str1 = "Hello";
   ```
- **Using `new` Keyword:**
   ```java
   String str2 = new String("Hello");
   ```

---

### 2. Concatenation
Combining strings using the `+` operator.
```java
String str1 = "Hello";
String str2 = "World";
String result = str1 + " " + str2;  // Result: "Hello World"
```

---

### 3. Length of a String
The `length()` method returns the number of characters in the string.
```java
String str = "Hello";
int length = str.length();  // Result: 5
```

---

### 4. Accessing Characters
The `charAt(index)` method fetches a character at a specific position.
```java
String str = "Hello";
char ch = str.charAt(1);  // Result: 'e'
```

---

### 5. Substring
The `substring(start, end)` method extracts a part of the string.
```java
String str = "HelloWorld";
String sub = str.substring(0, 5);  // Result: "Hello"
```

---

### 6. String Comparison
- **Content Equality:** Using `equals()`.
   ```java
   String str1 = "Hello";
   String str2 = "Hello";
   boolean isEqual = str1.equals(str2);  // Result: true
   ```
- **Reference Equality:** Using `==`.
   ```java
   String str1 = new String("Hello");
   String str2 = new String("Hello");
   boolean isSame = (str1 == str2);  // Result: false
   ```

---

### 7. Case Conversion
- Convert to uppercase: `toUpperCase()`
- Convert to lowercase: `toLowerCase()`
   ```java
   String str = "Hello";
   String upper = str.toUpperCase();  // Result: "HELLO"
   String lower = str.toLowerCase();  // Result: "hello"
   ```

---

### 8. Replace Substrings
The `replace(old, new)` method replaces all occurrences of a substring.
```java
String str = "HelloWorld";
String replaced = str.replace("World", "Java");  // Result: "HelloJava"
```

---

### 9. Check for Substrings
The `contains()` method checks if a string contains a specific sequence.
```java
String str = "HelloWorld";
boolean hasJava = str.contains("World");  // Result: true
```

---

### 10. Trimming Whitespace
The `trim()` method removes leading and trailing whitespaces.
```java
String str = "  Hello  ";
String trimmed = str.trim();  // Result: "Hello"
```

---

### 11. Splitting Strings
The `split()` method breaks a string into an array based on a delimiter.
```java
String str = "apple,banana,cherry";
String[] fruits = str.split(",");
// Result: ["apple", "banana", "cherry"]
```




