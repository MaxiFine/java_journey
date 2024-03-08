import java.util.Scanner;

// This program demonstrate the Switch statements

public class SwitchDemo {

    public static void main(String[] args){

        int number;  // user entry

        // Scanner Object
        Scanner key = new Scanner(System.in);

        // Suggest options
        System.out.println("Enter Options 1, 2, 3:");
        number = key.nextInt();

        // Determine the number input using the SWITCH statement
        // Demonstrating Formatting options the printf()
        // Demonstrating the
        switch(number){
            case 1:
                System.out.println("You Enter Option 1:HURAAY..." +
                        " Using Precision Specifier of '%.2f' .");
                double sales = 3023.5006;
                System.out.printf("Our Sales are %.2f for the day. \n", sales);
                break;
            case 2:
                System.out.println("You Entered Option 2:YEEAAHH...");
                double price = 30235.00;
                System.out.printf("Our Sales are %f for the day. \n", price);
                break;
            case 3:
                System.out.println("You Entered Option 3:YOOOO...");
                System.out.println("Combining width and precision in the same format specifier");
                double sale = 304523.455300;
                System.out.printf("Our Sales are %,.2f for the day. \n", sale);
                break;
            default:
                System.out.println("Choice no int 1, 2, or 3! ");
        }

        // upon every case remember to add the break statement
        // else it will go ahead and execute the rest of the codes
    }
}
