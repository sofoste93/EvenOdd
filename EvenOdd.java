package EvenOdd;

/**
 * Check the odd or even parity
 * of any given number
 */
public class EvenOdd {
    double number;
    double witness;
    double mod2 = 2;

    //msg
    String msgEven = " is an even number";
    String msgOdd = " is an odd number";
    String msgError = " is less than 0";
    /**
     * constructor
     * @param number
     */
    public EvenOdd(double number) {
        this.number = number;
    }

    /**
     * getter method
     * @return
     */
    public double getNumber() {
        return number;
    }

    /**
     * check parity
     * of each number
     */
    void checkParity(double number){
        witness = 0;
        if (number % mod2 != witness) {
            System.out.println(number + msgOdd);
        } else {
            System.out.println(number + msgEven);
        }
    }
    /*Welcome screen*/
    void welcomeTitle(){
        System.out.println("\n-----------------------------------");
        System.out.println("\t\tWelcome to EvenOdd.");
        System.out.println("-----------------------------------\n");

    }
    /*
    * set MENU
     */
    void menuOptions(){
        System.out.println("\t\t\tMENU");
        System.out.println("**************************************");
        System.out.println("- Enter 'start' or '1' to start");
        System.out.println("- Enter 'quit', 'stop' or '0' to stop");
        System.out.println("**************************************");

    }
}
