import java.util.Scanner;
public class SentinelsInJava {

    public static void main(String[] args){

        int days;
        double sales;
        double totalSales;
        String input;

        // Scanner object to take inputs
        Scanner in = new Scanner(System.in);
        System.out.println("For how many days do you have sales figures: ");
        input = in.nextLine();

        days = Integer.parseInt(input);

        // accumulation of Sales
        totalSales = 0.0;
        for(int count = 1; count <= days; count++){
            System.out.println("Enter sales for Day " + count + ": " );
            input = in.nextLine();
            sales = Double.parseDouble(input);
            totalSales += sales;
        }
        System.out.println("The total sales for " + days + " is $" + totalSales);

    }
}


