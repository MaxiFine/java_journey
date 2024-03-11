import java.util.Scanner;
public class WhileLoopInJava {

    // This program will take a user input to check if the
    // input falls with a range.
    public static void main(String[] args){

        // Scanner Object.
        Scanner s = new Scanner(System.in);

        // initiating the while Loop
        int n = s.nextInt();

        while (n < 1 || n > 10){
            System.out.println(n + " is not between the range. Try again: ");
            n = s.nextInt();
        }

        System.out.println(n + " falls within the range of 1 and 10.");
    }
}
