
import java.util.Scanner;

public class Calculator {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int choice;

        System.out.println("Welcome to Scientific Calculator.Please choose any option.\n");

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
                    double result;
                    result = calculator.squareRoot(number1);
                    System.out.println("The square root of " + number1 + " is " + result);
                    break;
                default:
                    return;

            }
        }while(true);


    }

    public double squareRoot(double number){
        return Math.sqrt(number);
    }

}
