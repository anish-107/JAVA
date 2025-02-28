# Java Scanner Class and Basic Structure of a Java Program

## Java Scanner Class

### Introduction
The `Scanner` class in Java is used for obtaining input of primitive types such as `int`, `double`, `float`, `string`, etc. It is found in the `java.util` package and allows users to read input from the keyboard, files, or other input streams.

### Importing Scanner
To use the `Scanner` class, you need to import it at the beginning of your program:

```java
import java.util.Scanner;
```

### Creating a Scanner Object
A `Scanner` object is created to read input from a specified source, usually `System.in` (keyboard input):

```java
Scanner sc = new Scanner(System.in);
```

### Commonly Used Methods of Scanner Class
| Method | Description |
|--------|-------------|
| `nextInt()` | Reads an `int` value from the user |
| `nextDouble()` | Reads a `double` value |
| `nextFloat()` | Reads a `float` value |
| `nextLong()` | Reads a `long` value |
| `nextBoolean()` | Reads a `boolean` value (true/false) |
| `next()` | Reads a single word (until space) |
| `nextLine()` | Reads an entire line of input |
| `nextByte()` | Reads a `byte` value |
| `nextShort()` | Reads a `short` value |
| `useRadix(int radix)` | Sets the radix for numerical input |

### Example Usage
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        
        sc.close(); // Always close the scanner
    }
}
```

### Important Notes
- Always **close the scanner** using `sc.close();` to free up resources.
- `nextLine()` reads the entire line, while `next()` reads only a single word.
- Be cautious when mixing `nextLine()` with other input methods like `nextInt()`, as it can cause input skipping due to newline characters.

---

## Basic Structure of a Java Program

### Structure
A Java program consists of:
1. **Package declaration** (optional)
2. **Import statements** (if needed)
3. **Class definition**
4. **Main method**
5. **Statements inside the main method**

### Example Java Program
```java
// 1. Package declaration (optional)
package mypackage;

// 2. Import statement (if required)
import java.util.Scanner;

// 3. Class definition
public class MyFirstProgram {
    
    // 4. Main method (Entry point of the program)
    public static void main(String[] args) {
        // 5. Statements inside the main method
        System.out.println("Hello, World!");
    }
}
```

### Explanation
1. **Package Declaration:** Defines the package name (optional).
2. **Import Statements:** Used to import necessary Java libraries.
3. **Class Definition:** The class name should match the filename (`MyFirstProgram.java`).
4. **Main Method:** Every Java program must have a `main` method to execute code.
5. **Statements:** Instructions to be executed.

### Key Rules
- The file name **must match** the class name.
- The `main` method **must be inside a class**.
- Java is **case-sensitive** (`Main` and `main` are different).
- The **entry point** of every Java application is the `main` method:

```java
public static void main(String[] args)
```

### Summary
- Java programs start execution from the `main` method.
- The `Scanner` class is used for taking user input.
- Every statement in Java **must end with a semicolon (`;`)**.
- Comments (`// single-line` and `/* multi-line */`) help in documentation.

---

