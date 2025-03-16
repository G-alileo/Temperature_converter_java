import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        // Declaring variable
        double user_temp = 0.00;
        int user_scale = 3;

        //creating an object of the relevent classes
        Main myobj = new Main();
        Scanner user_val = new Scanner(System.in);
        boolean running = true;

        // Taking user input
        while (running) {
            try {
                System.out.print("\n======================================================================================\n\n");
                System.out.print("Enter Your Temperature : ");
                user_temp = user_val.nextDouble();
                System.out.print("\n====================================================================================\n\n");
            } catch (InputMismatchException e) {
                
                System.out.println("Error : Invalid input type!");
                user_val.nextLine();
                break;
            }

            // clearing the scanner
            user_val.nextLine();

            try {
                System.out.println("Enter your conversion Scale : ");
                System.out.println("\n\t\t 1. To Farenheit. ");
                System.out.println("\t\t 2. To Degree Celcious. ");
                System.out.println("\t\t 3. Exit.  ");
                System.out.print("\nEnter Your choice:  ");
                int test_user_scale = user_val.nextInt();
                System.out.print("\n=====================================================================================\n\n");

                // Checking if user choice is within range
                if (test_user_scale > 0 && test_user_scale < 4) {
                    user_scale = test_user_scale;
                }

                else{
                    System.out.println("ERROR : Invalid Choice!");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("ERROR : Invalid input type.");
                user_val.nextLine();

            }

            switch (user_scale) {
                case 1:
                    System.out.println( user_temp + "°c" + " " + "To Fahrenheight is : " + myobj.DegreeToFahrenheit(user_temp) + "°f"); 
                    break;

                case 2:
                System.out.println(user_temp + "°f" + " " + "To Degree Celcious is : "   + myobj.FahrenheitToDegree(user_temp) + "°c"); 
                    break;

                case 3:
                    System.out.println("Exiting.....Goodbye.");
                    System.out.print("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n\n");
                    running = false;
                    break;
            }

        }
        
    }

    // A function that converts Fahrenheit to Degree celcious
    public double FahrenheitToDegree(double x){
        return (x - 32) * 5/9;
    }


    // A function that converts Degree celcious to Fahrenheit
    public double DegreeToFahrenheit(double x){
        return (x * 9/5) + 32;
    }
}