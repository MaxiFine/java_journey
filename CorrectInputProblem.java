import java.util.Scanner;  // for keyboard inputs

// This program shows how to avoid newline problem with keyboard inputs

public class CorrectInputProblem {

    public static void main(String[] args){
        String name;  // username
        int age;  // user age
        double income;  // user income

        // for keyboard inputs
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your Name: "); // user name
        name = keyboard.nextLine();  // taking the value from the user

        // Taking the user age
        System.out.println("Enter your age: ");
        age = keyboard.nextInt();

        // taking the user's income
        System.out.println("Enter your Income");
        income = keyboard.nextDouble();

        // Let's display the inputs after processing
        System.out.println("Hello, " + name + ". Your age is " +
                age + " and your income is $" + income);
    }


}
