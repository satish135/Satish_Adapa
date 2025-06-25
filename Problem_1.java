import java.util.Scanner;

public class Problem_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number (a): ");
        double a = scanner.nextDouble();

        System.out.println("Enter Second Number (b): ");
        double b = scanner.nextDouble();

        scanner.nextLine(); // consume leftover newline

        System.out.println("Enter Operation (add, subtract, multiply, divide): ");
        String operation = scanner.nextLine();

        Calculator calc = new Calculator(a, b, operation);
        double result = calc.Calculate();

        System.out.println("Result: " + result);

        scanner.close();
    }
}

class Calculator {

    private double a;
    private double b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double Calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;

            case "subtract":
                return a - b;

            case "multiply":
                return a * b;

            case "divide":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero.");
                    return Double.NaN;
                }

            default:
                System.out.println("Invalid operation.");
                return Double.NaN;
        }
    }
}
