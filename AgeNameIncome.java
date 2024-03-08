import java.util.Scanner;

public class AgeNameIncome {

    public static void  main(String[] args){

        String name;
        int age;
        double income;

        // set the input scanner
        Scanner key = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = key.nextLine();

        System.out.println("Enter age: ");
        age = key.nextInt();

        System.out.println("Enter you Income: ");
        income = key.nextDouble();

        System.out.println("My name is " + name + ", my age is " + age + "\n" +
                "I hope to earn $" + income + " per year.");

    }
}
