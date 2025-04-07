# String Utils

A Java utility program demonstrating various string operations and algorithms.

## Features

This program provides the following functionality:

- **Unicode Code Point Analysis**: Extracts and displays Unicode code points from strings, including support for emoji and non-Latin characters
- **Fibonacci Sequence Generator**: Calculates and returns a Fibonacci sequence up to n terms
- **String Reversal**: Efficiently reverses any input string
- **Palindrome Checker**: Determines whether a string is a palindrome (reads the same backward as forward)

## Usage

The main class contains example usages for each feature:

```java
// Unicode code point analysis
String text = "Hi 😊 你";
text.codePoints().forEach(i -> {
    System.out.println("the code point for " + i + " =" + new String(Character.toChars(i)));
});

// Generate Fibonacci sequence
System.out.println("the fibonacci of 10 is \n" + Arrays.toString(fibonacci(10)));

// Reverse a string
System.out.println(reverse("Hello"));

// Check if a string is a palindrome
palindrome("madam");
```

## Methods

### `fibonacci(int n)`
Returns an array containing the Fibonacci sequence up to the nth term.

### `reverse(String s)`
Returns the reversed version of the input string.

### `palindrome(String s)`
Checks if the input string is a palindrome and prints the result.

## Requirements

- Java SE 8 or higher


