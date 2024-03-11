import java.util.Scanner;
public class ForLoopInJava {
    public static void main(String[] args){
//        for (int i = 1; i <= 10; i++){
//            for(int j = 1; j <= 10; j++)
//                System.out.print((i * j) + " ");
//
//            System.out.println();
//        }
        // This program prints even numbers fro
        // 1 to 100 increasing order
//        for(int i = 1; i <= 100; i++){
//            if(i % 2 == 0)
//                System.out.print(i + " ");
////            System.out.println();
//        }
        // Decreasing Order.
        for(int i = 100; i >= 1; i--){
            if(i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}

