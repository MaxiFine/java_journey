import java.util.Scanner;


public class LoanQualifier {

    public static void main(String[] args){

        double salary;
        double yearOnJob;
        String input;

        // User inputs
        Scanner key = new Scanner(System.in);
        System.out.println("Enter you salary: ");
        salary = key.nextDouble();

        System.out.println("Enter your experience: ");
        yearOnJob = key.nextDouble();

//        if (salary >= 30000){
//            if(yearOnJob >=2 ){
//                System.out.println("You Qualify for the Loan, contact Manager");
//            }
//            else {
//                    System.out.println("You don't Qualify for the Loan... \n" +
//                        " you must have at least 2 years on job...");
//                }
//
//        }
//        else {
//                System.out.println("You must earn about 30000 in a year...");
//             }

        // a more advanced way to write it
//        if (salary >= 30000)
//            if(yearOnJob >=2 )
//                System.out.println("You Qualify for the Loan, contact Manager");
//            else
//                System.out.println("You don't Qualify for the Loan... \n" +
//                        " you must have at least 2 years on job...");
//        else
//            System.out.println("You must earn about 30000 in a year...");

        // USING LOGICAL OPERATORS TO EVALUATE
        if (salary >= 30000 || yearOnJob >= 2)
            System.out.println("You Qualify for the Loan, contact Manager");
        else
            System.out.println("You don't qualify for the Loan...");



    }
}
