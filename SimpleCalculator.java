import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.println("Enter the first number fhertrrturtf: ");
        int num1 = scanner.nextInt();

        // Input operator
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Input second number

        System.out.println("Enter the second number: ");
        if(!scanner.hasNextInt()){
            System.out.println("Error: Please input integer number");
        }
        int num2 = scanner.nextInt();
        


        // Perform calculation
        if (operator == '+') {
            int Result = num1+num2;
            System.out.println("Addition: " + Result);
        } else if (operator == '-') {
           int Sub = num1-num2;
            System.out.println("Substraction: " + Sub);
        } else if (operator == '*') {
            int Multi = num1*num2;
            System.out.println("Multiplication: " + Multi);
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } 
            
            else {
                int Div = num1/num2;
                System.out.println("Division: "+ Div);
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
        }
    }
}
