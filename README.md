# Java 15 Features Demo Project

## Overview

This project demonstrates several new features introduced in Java 15, focusing on enhancements to the `String` class and multi-line string literals (text blocks). The code is organized with a simple service class that showcases each feature, and a main class that runs the demonstrations.

## Project Structure

```
src/
  main/
    java/
      com/
        java15/
          Main.java
          service/
            Service.java
pom.xml
README.md
```

- **Main.java**: Entry point of the application, invokes feature demonstrations.
- **Service.java**: Contains methods that demonstrate Java 15 features.

## Java 15 Features Demonstrated

### 1. Text Blocks (`""" ... """`)
- **Location:** `Service.displayTextBlock()`
- **Description:** Text blocks allow for multi-line string literals, making it easier to write readable multi-line strings without escape sequences.
- **Example:**
  ```java
  String block = """
      this is a example of block
      """;
  ```

### 2. String Formatting (`String.formatted()`)
- **Location:** `Service.stringFormatted()`
- **Description:** The new `formatted()` method on `String` provides a more fluent way to format strings, similar to `String.format()` but as an instance method.
- **Example:**
  ```java
  String message = "Testing formatted string %s with java version %d".formatted(name, javaVersion);
  ```

### 3. String Indentation Handling (`String.stripIndent()`)
- **Location:** `Service.stripIndentString()`
- **Description:** The `stripIndent()` method removes incidental white space from the beginning and end of each line in a text block, making it easier to maintain readable code and output.
- **Example:**
  ```java
  String block = """
      This is a strip string text
        using java 15
       features                
      """;
  System.out.println(block.stripIndent());
  ```

### 4. Escape Sequence Translation (`String.translateEscapes()`)
- **Location:** `Service.stringTranslateScapes()`
- **Description:** The `translateEscapes()` method interprets escape sequences in a string, such as `\n` for new lines, which is especially useful when working with text blocks.
- **Example:**
  ```java
  String block = """
      This is a \\n text translated    
      """;
  String translated = block.translateEscapes();
  ```

## Build and Run

This project uses Maven for build management. The `pom.xml` is configured for Java 15 (though the properties section mentions Java 22, the compiler plugin is set to 15).

**To build and run:**
```sh
mvn clean compile
mvn exec:java -Dexec.mainClass="com.java15.Main"
```

## Summary

This project is a concise demonstration of Java 15's improvements to string handling, especially text blocks and new `String` methods. These features make Java code more expressive and easier to maintain, especially when dealing with multi-line strings and formatting.
