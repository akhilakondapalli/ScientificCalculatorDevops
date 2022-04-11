package Calculator;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int choice;

        System.out.println("Welcome to Scientific Calculator.Calculator.Please choose any option.\n");

        Calculator calculator = new Calculator();

        do {

            System.out.println("1.Square root");
            System.out.println("5.exit");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter any positive number to calculate Square root. \n");
                    double number1;
                    number1 = input.nextDouble();
                    System.out.println("The square root of " + number1 + " is " + calculator.squareRoot(number1));
                    break;
                default:
                    return;

            }
        }while(true);


    }

    public double squareRoot(double number){
        double result;
        result = Math.sqrt(number);
        logger.info("SquareRoot - input : "+ number + "output : " + result);
        return result;
    }

}
