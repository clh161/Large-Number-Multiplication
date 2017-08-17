# StringMultiplication [![Build Status](https://travis-ci.org/clh161/StringMultiplication.svg?branch=master)](https://travis-ci.org/clh161/StringMultiplication)
Multiplication , addition and subtraction of large number (larger than Long)

## Features
* No number parsing from string
* Avoid mathematical operation in calculation

## Methodology

This library applies [Karatsuba algorithm ](https://en.wikipedia.org/wiki/Karatsuba_algorithm) for multiplication.

## Usage

### Multiplication
```java
 String a = "3141592653589793238462643383279502884197169399375105820974944592";
 String b = "2718281828459045235360287471352662497757247093699959574966967627";
 String sumSring = StringMultiplication.product(a, b);
 //sumSring = 8539734222673567065463550869546574495034888535765114961879601127067743044893204848617875072216249073013374895871952806582723184
```
