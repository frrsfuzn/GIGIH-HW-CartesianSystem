# Cartesian System
## Problem Statement
- Find a length of two points in cartesian system

## Dev Environment
CartesianSystem library use following tools:
- Java 17
- Gradle 6.3
- IntelliJ IDEA ([download](https://www.jetbrains.com/idea/download/))

## How to Run Test
Enter the following command to run the test in command line
`gradle test` <br>
If you're in IntelliJ IDEA. Right click at CartesianSystemTest in the right project panel then click `run`.

## Build Instructions
Enter the following command to build the project
`gradle build` or if you're in IntelliJ IDEA. Go to `Build` menu at the top of the software then click `build project` or you can press `Ctrl+F9`.  

## Run Instructions
### Run with Example file
We prepared an Example file for you to run the library. Enter the following command to run the example file `gradle run` in your command line or right click at Example file in the right project panel then click `run`. 
### Run with your own file
- If you want to implement this library in your java file, make a java file first.
- in build.gradle file, change `com.minibootcamp.Example` with your package and main file.
- Then make a new object of CalculateTheLengthOfTwoPoints (i.e) `CartesianSystem cs = new CartesianSystem();` in your created java file.
- Set your points `setCoordinateX1()`,  `setCoordinateY1()`,  `setCoordinateX2()`,  `setCoordinateY1()`. After you set it you can calculate with `calculateLength()` method. 
- If you want to change point, you can chagne it with re set your point and then calculate again with `calculateLength()`
- Heres a description of methods that can be use with this class

| Method  |  Description |
| ------------- | ------------- |
| setCoordinateX1(double num)  | Set x of first point |
| setCoordinateY1(double num)  | Set y of first point |
| setCoordinateX2(double num)  | Set x of second point |
| setCoordinateY2(double num)  | Set y of second point |
| calculateLength() | Return a float number of length from two points |
