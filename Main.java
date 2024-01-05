public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Mesozoic Eden");

        String name = "Maxwell Adomako";
        String position = "Park Manager";
        System.out.println("My name is " + name + " and I want to be a " +
                " " + position + " in Mesozoic Eden.");

        // Closing time
        String openingHours = "08:00";
        String closingHours = "20:00";
        System.out.println("The zoo closes by " + closingHours + " but opens at " +
                openingHours);

        // with numbers
        int numbers = 5;
        int doubled = doubleNumber(numbers);
        System.out.println("The doubled number is: " + doubled);

        // Dinosaur Program
        String dname="Taka", diet="Herbivores";
        int dage=34, weight=134;
        System.out.println("Meet, " + dname + " it has a robust weight of " + weight
        + "kgs.");

        // Arithmetic Casting

    }
    // the everything must be inside the main class curly brackets


    public static int doubleNumber(int input){
        return  input * 2;
    }
}


