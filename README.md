# Temperature Converter

A simple Java-based Temperature Converter that allows users to convert temperatures between Celsius and Fahrenheit.

## Features
- Convert Celsius to Fahrenheit.
- Convert Fahrenheit to Celsius.
- Handles invalid user input gracefully.
- Provides a user-friendly command-line interface.

## How It Works
1. The user enters a temperature value.
2. The user selects a conversion option:
   - Convert Celsius to Fahrenheit.
   - Convert Fahrenheit to Celsius.
   - Exit the program.
3. The program performs the conversion and displays the result.

## Requirements
- Java Development Kit (JDK) installed.
- A Java compiler (e.g., `javac`).

## Installation and Usage
1. Clone or download the repository.
2. Open a terminal or command prompt.
3. Navigate to the directory containing `Main.java`.
4. Compile the Java file:
   ```sh
   javac Main.java
   ```
5. Run the program:
   ```sh
   java Main
   ```
6. Follow the on-screen instructions to enter a temperature and choose a conversion option.

## Code Overview
The program consists of the following components:
- `Main` class: Contains the main method, user input handling, and program flow.
- `DegreeToFahrenheit(double x)`: Converts Celsius to Fahrenheit.
- `FahrenheitToDegree(double x)`: Converts Fahrenheit to Celsius.

## Example Usage
```
======================================================================================

Enter Your Temperature : 100

====================================================================================

Enter your conversion Scale :

         1. To Fahrenheit.
         2. To Degree Celsius.
         3. Exit.  

Enter Your choice:  1

=====================================================================================

100.0°C To Fahrenheit is : 212.0°F
```

## Error Handling
- If the user enters a non-numeric value, an error message is displayed.
- If the user selects an invalid option, they are prompted to choose again.

## License
This project is open-source.

## Author
- Jamespeter Murithi

