# PO Weekly Coding Challenges
Completion of Weekly Coding Challenges

## 09/08/2021
Write an SQL Script to Seed Sample Data (attached below) and answer the below queries:
  1. Write an SQL query to fetch worker names with salaries >= 50000 and <= 100000. | [Solution](https://github.com/ajang06/POWeeklyCoding/blob/d2d9d6df03b8eefdb66c10e65bf64fa6ba2d3c99/Week1/1.sql)
  2. Write an SQL query to fetch the no. of workers for each department in the descending order. | [Solution](https://github.com/ajang06/POWeeklyCoding/blob/d2d9d6df03b8eefdb66c10e65bf64fa6ba2d3c99/Week1/2.sql)
  3. Write an SQL query to fetch intersecting records of two tables. | [Solution](https://github.com/ajang06/POWeeklyCoding/blob/d2d9d6df03b8eefdb66c10e65bf64fa6ba2d3c99/Week1/3.sql)
  4. Write an SQL query to determine the 5th highest salary without using TOP or limit method. | [Solution](https://github.com/ajang06/POWeeklyCoding/blob/d2d9d6df03b8eefdb66c10e65bf64fa6ba2d3c99/Week1/4.sql)

## 09/13/2021
  1. Write a program to encrypt a message using the ROT13 technique. | [Solution](https://github.com/ajang06/POWeeklyCoding/blob/main/Week2/src/main/java/solutions/ROT13Technique.java)
  2. Write a program to convert a decimal number to its octal equivalent. | [Solution](https://github.com/ajang06/POWeeklyCoding/blob/main/Week2/src/main/java/solutions/DecimalToOctal.java)

## 09/20/2021
Create a function that takes the memory size (ms is a string type) as an argument and returns the actual memory size. | [Solution](https://github.com/ajang06/POWeeklyCoding/blob/main/Week3/src/main/java/solutions/Memory.java)

*Examples*
> actualMemorySize("32GB") --> "29.76GB"<br />
> actualMemorySize("2GB") --> "1.86GB"<br />
> actualMemorySize("512MB") --> "476MB"<br />

*Notes*
- The actual storage loss on a USB device is 7% of the overall memory size!
- If the actual memory size was greater than 1 GB, round your result to two decimal places.
- If the memory size after adjustment is smaller then 1 GB, return the result in MB. 
