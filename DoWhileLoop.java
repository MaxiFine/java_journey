import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            n = in.nextInt();
        }while(n < 1 || n > 10);

        // if true then run
        System.out.println( n + " is between 1 and 10.");
    }

}
