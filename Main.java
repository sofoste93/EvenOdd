package EvenOdd;
/*
 * -------------------------
 * Program: EvenOdd
 * Type: Console App
 * Written by: sofoste
 * Check either a given number
 * is odd or even
 * -------------------------
 */

import java.util.Scanner;

public class Main extends EvenOdd{

    static Scanner input = new Scanner(System.in);
    static double userNumber;
    static String choice;
    static boolean quit = false;
    static String errMsg = "Unknown command! Reenter your choice ";

    /**
     * constructor
     * @param number
     */
    public Main(double number) {
        super(number);
    }

    public static void main(String[] args) {
        // create a new object
        EvenOdd evenOdd = new EvenOdd(userNumber);
        // title
        evenOdd.welcomeTitle();
        // get menuOptions
        evenOdd.menuOptions();
        do {
            System.out.print("Select an option: ");
            choice = input.next(); // do not use .nextLine() to avoid switch to end in the default behaviour
            switch (choice) {
                case "start", "1" -> {
                    System.out.print("Enter any number: ");
                    userNumber = input.nextDouble();
                    evenOdd.checkParity(userNumber); //checkParity() to check the parity of the number
                    System.out.println("-------------------------");
                }
                case "stop","quit", "0" -> {
                    quit = true;
                    input.close();
                }
                default -> {
                    System.out.println(errMsg.toUpperCase());
                    System.out.println("-------------------------");
                }
            }

        }while (!quit);

        System.out.println("\n-----------------------------------");
        System.out.println("\tThanks for using the program.");
        System.out.println("-----------------------------------\n");



    }
}
