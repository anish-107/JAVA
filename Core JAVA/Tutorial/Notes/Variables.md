### Variables:
- **What are variables?**: Variables are containers used to store data values in a program.
- **Components of variables**: A variable typically consists of a name, a data type, and a value.
- **What can we store in variables?**: Variables can store various types of data, such as numbers, text, boolean values, and object references.
- **Memory allocation for variables**: When a variable is declared, memory is allocated based on its data type to store its value.

### RAM (Random Access Memory):
- **What is RAM?**: RAM is a type of computer memory that can be accessed randomly, allowing data to be read or written in any order.
- **Working and structure of RAM**: RAM is organized into cells or memory locations, each with a unique address. It stores data temporarily while the computer is running, providing fast access for the CPU.

### Memory Addressing:
- **Explanation of memory addressing**: Memory addressing is the process of accessing specific memory locations in RAM using their unique addresses.

### Syntax for Declaration of Variables in Java:
- Syntax: `data_type variable_name;`
- Example: `int age;`

### Variable Naming Rules in Java:
- Must begin with a letter, dollar sign ($), or underscore (_).
- Can contain letters, digits, dollar signs, and underscores.
- Cannot be a Java keyword.
- Cannot contain spaces or special characters (except for dollar sign and underscore).
- Should be descriptive and meaningful.

### Assigning Value to Variable:
- Syntax: `variable_name = value;`
- Example: `age = 30;`

### Data Types in Java:
| Data Type | Size (in bytes) | Default Value | Type of Value Stored |
|-----------|-----------------|---------------|----------------------|
| byte      | 1               | 0             | Integer              |
| short     | 2               | 0             | Integer              |
| int       | 4               | 0             | Integer              |
| long      | 8               | 0L            | Integer              |
| float     | 4               | 0.0f          | Floating point       |
| double    | 8               | 0.0d          | Floating point       |
| char      | 2               | '\u0000'      | Character            |
| boolean   | 1               | false         | Boolean              |

### Data Types:
- **What are data types?**: Data types define the type of data that a variable can hold.
- **Classification of Java data types**: Java data types are classified into two categories: primitive data types and reference data types.

### Naming Conventions:
- **Camel case**: Start with a lowercase letter and capitalize the first letter of each subsequent word (e.g., `myVariableName`).
- **Snake case**: Use lowercase letters and separate words with underscores (e.g., `my_variable_name`).
- **Kebab case**: Use lowercase letters and separate words with hyphens (e.g., `my-variable-name`).
- **Pascal case**: Capitalize the first letter of each word without using spaces or punctuation (e.g., `MyClassName`).

### Variable Identifiers:
- Variable identifiers are names given to variables in a program.

### Java Keywords:
- Java keywords are reserved words that have predefined meanings in the Java language and cannot be used as identifiers.

### Literals:
- Literals are constant values that are directly assigned to variables or used in expressions.

### Assignment Operator:
- The assignment operator (`=`) is used to assign a value to a variable.

### User Input Process in Java:
- User input in Java is typically obtained using the `Scanner` class from the `java.util` package.

### Closing Scanner:
- It is a good practice to close the `Scanner` object after its use to release system resources and prevent memory leaks.

### Exceptions:
- Exceptions are runtime errors that occur during program execution.
- A basic solution for handling exceptions is to use try-catch blocks to catch and handle exceptions gracefully.

### Type Casting and Conversion:
- Type casting is the process of converting a value from one data type to another.
- Coercion refers to implicit type conversion performed by the compiler.
- Implicit type casting automatically converts smaller data types to larger data types.
- Explicit type casting is done manually using casting operators.

