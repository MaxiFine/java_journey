
// Scanner utility
import java.util.Scanner;

public class TimeCalculator {
    // Main Method
    public static void main(String[] args){

        Scanner keyin = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter the number of Seconds: ");
        int seconds = keyin.nextInt();

        //int seconds = Integer.parseInt(input);

        // Compute it according to time
        int minutes = seconds / 60;
        int hours = seconds / 3600;
        int days = seconds / 86400;

        // Check Results and Display for user
        // This Logic will execute all the if statements
        if (seconds >= 60){
            System.out.printf("Number of minutes: " + minutes);
        }

        if(seconds >= 3600){
            System.out.println(" Number of hours: " + hours);
        }
        if (seconds >= 85400){
            System.out.println(" Number of days: " + days);
        }
        keyin.close();
    }
}
