## 1. Steps to install JDK on different OS and different Linux distros
- **Windows**: Download the JDK installer from the Oracle website, run it, and follow the installation wizard.
- **macOS**: Install JDK using Homebrew with the command `brew install --cask adoptopenjdk`.
- **Ubuntu/Debian**: Use the apt package manager to install JDK with the command `sudo apt install default-jdk`.
- **Fedora/CentOS**: Use the dnf or yum package manager to install JDK with the command `sudo dnf install java-11-openjdk-devel`.

## 2. Oracle JDK vs OpenJDK
- **Oracle JDK**: Oracle's commercial distribution of Java Development Kit.
- **OpenJDK**: Open-source implementation of the Java Platform, Standard Edition.

## 3. What is LTS
- **LTS (Long-Term Support)**: Refers to versions of software that are supported for an extended period, typically for several years, with updates and security patches.

## 4. Verify JDK installation
- Open a terminal/command prompt and type `java -version`. This command will display the installed Java version.

## 5. Adding JDK to the PATH in Java
- On Windows: Add the JDK's `bin` directory to the system PATH variable.
- On macOS/Linux: Edit the `.bash_profile` or `.bashrc` file to include the JDK's `bin` directory in the PATH.

## 6. First class using a text editor
- Create a new file with a `.java` extension and write a Java class with a `main` method.

## 7. Run that class using the terminal
- Compile the Java file using the `javac` command: `javac YourClassName.java`.
- Run the compiled class file using the `java` command: `java YourClassName`.

## 8. Anatomy of that program every word
- **Class**: A blueprint for creating objects that defines attributes and behaviors.
- **Main method**: The entry point of a Java program, marked by the signature `public static void main(String[] args)`.
- **System.out.println()**: A method used to print text to the console.

## 9. File extensions: .java, .class
- **.java**: Source code files containing Java code.
- **.class**: Compiled bytecode files generated from Java source files.

## 10. JDK vs JVM vs JRE
- **JDK (Java Development Kit)**: A software development kit that includes tools for developing Java applications.
- **JVM (Java Virtual Machine)**: An abstract computing machine that executes Java bytecode.
- **JRE (Java Runtime Environment)**: A runtime environment required for executing Java applications.

## 11. What are libraries
- Libraries are collections of precompiled code modules that provide reusable functions and classes to simplify software development.

## 12. Showing output: println vs print
- **println**: Prints the text to the console and moves the cursor to the next line.
- **print**: Prints the text to the console without moving the cursor to the next line.

## 13. Importance of main method and its signature
- The main method is the entry point of a Java program where execution begins.
- Its signature `public static void main(String[] args)` specifies the method's accessibility, return type, and parameters.

## 14. What is an IDE, Famous IDEs for JAVA
- **IDE (Integrated Development Environment)**: A software application that provides comprehensive facilities for software development.
- **Famous IDEs for Java**: IntelliJ IDEA, Eclipse, NetBeans.

## 15. Features of IDE
- Features of IDEs include code editing, syntax highlighting, code completion, debugging tools, version control integration, and project management.

## 16. Installing IntelliJ IDEA on different OS and different Linux distros
- Download the IntelliJ IDEA installer from the official website and follow the installation instructions for your specific operating system or Linux distribution.

## 17. Explain Project Structure on IntelliJ IDEA
- IntelliJ IDEA organizes projects into modules, which contain source code, resources, and configuration files.
- Project files are typically organized into directories such as `src` (source code), `res` (resources), `lib` (libraries), and `out` (compiled output).
