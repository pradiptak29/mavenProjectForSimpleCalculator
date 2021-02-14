package mavenProjectForSimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        double n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
        n1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        n2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
                output = n1 + n2;
                break;

            case '-':
                output = n1 - n2;
                break;

            case '*':
                output = n1 * n2;
                break;

            case '/':
                output = n1 / n2;
                break;

            /* If user enters any other operator or char apart from
             * +, -, * and /, then display an error message to user
             *
             */
            default:
                System.out.printf("Please enter a valid operator");
                return;
        }

        System.out.println(n1+" "+operator+" "+n2+": "+output);
    }
}