# EJavaCourse
This repository contains my homework from Java Winter Courses.
# Lesson 1
[**Task 1**](https://github.com/Elizabethssss/EpamJavaCourse/tree/master/Lesson1/src/task1) - console application that defines a positive integer number in the decimal number system, and then converts the number into binary/ternary/octal/hexadecimal number systems and prints the result.

[**Task 2**](https://github.com/Elizabethssss/EpamJavaCourse/tree/master/Lesson1/src/task2) - console application that finds all perfect numbers in the range of 1 to some given positive number and prints them (the perfect number is number that is equal to the sum of its positive divisors, excluding the number itself. For instance, 6 = 1 + 2 + 3).

[**Task 3**](https://github.com/Elizabethssss/EpamJavaCourse/tree/master/Lesson1/src/task3) - console application that calls method for building the piramide with a height ranging from 1 to 9.

[**Task 4**](https://github.com/Elizabethssss/EpamJavaCourse/tree/master/Lesson1/src/task4) - console application which rotates a square matrix of dimension N 90 ° counterclockwise. The values of matrix elements are set using a random numbers generator. The matrix should contain both positive and negative values. To check the result, you need to display a given matrix and after processing.

# Lesson 2
[**Task 1**](https://github.com/Elizabethssss/EpamJavaCourse/tree/master/Lesson2/src/main/java/task1) - console application that:
+ Identify the Drawable interface with the draw () figure construction method;
+ Describes an abstract Shape class that implements an interface Drawable and containing a shapeColor field of type String for the color of the shape and a constructor for initializing it, an abstract method for calculating the area of the shape calcArea () and an overridden method toString ();
+ describes the Rectangle, Triangle, Circle classes that inherit from the Shape class and implement the calcArea () method, and also override the toString () method;
+ creates a dataset of type Shape (an array with a dimension of at least 10 elements);
+ processes the array:
    - displays a data set;
    - calculates the total area of all figures in the data set;
    - calculates the total area of figures of a given type;
    - organizes the data set to increase the area of the figures, using the Comparator interface object
    - Sorts the data set by the color of the shapes using the Comparator interface object.
+ When building the application, use the architectural MVC pattern.

[**Task 2**](https://github.com/Elizabethssss/EpamJavaCourse/tree/master/Lesson2/src/main/java/task2) - console application that:
+ describes the data type according to the table;
+ creates a data set of the described type (an array with a dimension of at least 10 elements);
+ uses menu work to process the created data array according to the table;
+ uses the Comparator interface to organize the elements of the data array according to the table.
+ If as a result of processing the data array not found, then
a message must be displayed.
+ To check the result of work, you need to output the original array after creation.
+ When building the application, use the architectural MVC pattern.

| Class  | Data processing |
| ------------- | ------------- |
| __Book:__  | 1. Get a list of books by a specified author;  |
| Title, Author, Publisher, Year of publication, Number of pages, Price  | 2. Get a list of books that are published by a specified publisher;  |
| |3. Get a list of books published later than the specified year.|
| |4. Sort books by publishers|

# Lesson 3

[**Task 1**](https://github.com/Elizabethssss/EpamJavaCourse/tree/master/Lesson3/src/task1) - an application that:
- describes the hierarchy of classes according to the table;
- describes a generalized class according to the table;
- demonstrates the use of objects of a generalized class;
- data for filling classes and their processing are set by keyboard input

| Class hierarchy  | Generalized class |
| ------------- | ------------- |
| __Kids toys__  | __Playroom, for which to implement:__  |
| |1. Sorting toys by some parameter;  |
| |2. calculate the total value of all toys;|
| |3. Identify toys that match the specified range of parameters.|

[**Task 2**](https://github.com/Elizabethssss/EpamJavaCourse/tree/master/Lesson3/src/task2) - an application that:
- describes a class with some inner class according to the table;
- demonstrates the interaction between objects of these classes. For example, the creation of a department, the
 liquidation of a department, the reallocation of departments (sorting as an option), the supply of goods and so on.;
- data for filling classes and their processing are set by keyboard input

| Outer class  | Inner class |
| ------------- | ------------- |
| __Store:__  | __Department:__  |
| contains title and information about departments|contains a description of the department (name, type of goods, services, location)  |


[**Task 3**](https://github.com/Elizabethssss/EpamJavaCourse/tree/master/Lesson3/src/task3) - an application that:
- creates a class with functionality similar to the java.lang.Enum class;
- creates an enumeration class based on the above described class;
- demonstrates the use of the described enumeration.

# Lesson 4

[**Task 1**](https://github.com/Elizabethssss/EpamJavaCourse/tree/master/Lesson4) - Maven project that:
- has Junit dependency in the pom.xml file;
- has the class used to convert the temperature value to different units of measurement (Celsius, Kelvin, Fahrenheit);
- has a class with junit tests to test all the methods of the described class, which you can run to check;
- has parametrized tests.

[**Task 2**](https://github.com/Elizabethssss/EpamJavaCourse/blob/master/Lesson2/src/test/java/task2/model/StorageTest.java) - 
task 2.2 rebuild to Maven project and added unit tests.



