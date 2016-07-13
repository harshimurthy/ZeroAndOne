#Hacker rank Java programming

## 1. Basic output- HelloWorld

### Input Format

There is no input for this challenge.

### Output Format

You must print two lines of output:

Print Hello, World. on the first line.
Print Hello, Java. on the second line.
 ---

## 2. Basic output using scanner- StandardInput

### Input 
2 integers and a string

### Output
The values of interger in one line
The value of string on the other
---

## 3. If else checking even or odd value- IfElse

### Input
An integer

### Output
Tells whether the entered value is odd or even

---

## 4. If else - Weird

### Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

### Input Format

A single line containing a positive integer

### Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

---

## 5. scanning integer, string, double - ScannerTypes

Notice the weird behavior in the comments in the program

--
## 6. Formatting the output using System.out.printf- Formatting

http://alvinalexander.com/programming/printf-format-cheat-sheet

--
##String reverse

Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverse = new StringBuffer(A).reverse().toString();
