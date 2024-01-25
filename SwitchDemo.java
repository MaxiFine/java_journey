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
        switch(number){
            case 1:
                System.out.println("You Enter Option 1:HURAAY...");
                break;
            case 2:
                System.out.println("You Entered Option 2:YEEAAHH...");
                break;
            case 3:
                System.out.println("You Entered Option 3:YOOOO...");
                break;
            default:
                System.out.println("That's not 1, 2, or 3!");
        }

        // upon every case remember to add the break statement

    }

}
