import java.util.Scanner;

public class SalesSoftware {

    public static void main(String[] args){
        // variables for computations
        double totalDiscount;
        double totalAmount;
        double totalAmountPayable;
        int itemsBought;
        int price = 99;

        // Scanner for inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        itemsBought = input.nextInt();

        // computations will be done if it fits within a range
        // check across the place to find fit for it

        // The range of 10 - 19
        if (itemsBought >= 10 && itemsBought <= 19 ){
            totalAmount = price * itemsBought;  // Total amount of items
            totalDiscount = ((double) 20 / 100 ) * totalAmount;  // trying casting
            totalAmountPayable = totalAmount - totalDiscount;

            System.out.println("The number you bought comes with a discount of 20%");
            System.out.printf("The total amount without Discount was $%,.2f%n", totalAmount);
            System.out.printf("The total Discount is %,.2f%n", totalDiscount);
            System.out.printf("The total Amount payable is $ %,.2f%n", totalAmountPayable);
        }

        // The range of 20 - 49
        else if (itemsBought >= 20 && itemsBought <= 49 ){
            totalAmount = price * itemsBought;  // Total amount of items
            totalDiscount = ((double) 30 / 100 ) * totalAmount;  // trying casting
            totalAmountPayable = totalAmount - totalDiscount;

            System.out.println("The number you bought comes with a discount of 30%");
            System.out.printf("The total amount without Discount was $%,.2f%n", totalAmount);
            System.out.printf("The total Discount is %,.2f%n", totalDiscount);
            System.out.printf("The total Amount payable is $ %,.2f%n", totalAmountPayable);
        }

        // The range 50 - 99
        else if (itemsBought >= 50 && itemsBought <= 99 ){
            totalAmount = price * itemsBought;  // Total amount of items
            totalDiscount = ((double) 40 / 100 ) * totalAmount;  // trying casting
            totalAmountPayable = totalAmount - totalDiscount;

            System.out.println("The number you bought comes with a discount of 40%");
            System.out.printf("The total amount without Discount was $%,.2f%n", totalAmount);
            System.out.printf("The total Discount is %,.2f%n", totalDiscount);
            System.out.printf("The total Amount payable is $ %,.2f%n", totalAmountPayable);
        }

        // 100 or more range
        if (itemsBought >= 100){
            totalAmount = price * itemsBought;  // Total amount of items
            totalDiscount = ((double) 50 / 100 ) * totalAmount;  // trying casting
            totalAmountPayable = totalAmount - totalDiscount;

            System.out.println("The number you bought comes with a discount of 50%");
            System.out.printf("The total amount without Discount was $%,.2f%n", totalAmount);
            System.out.printf("The total Discount is %,.2f%n", totalDiscount);
            System.out.printf("The total Amount payable is $ %,.2f%n", totalAmountPayable);
        }



    }
}
