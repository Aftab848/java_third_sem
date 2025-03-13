import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float secondNumber = scanner.nextFloat();

        float sum = firstNumber + secondNumber;
        float difference = firstNumber - secondNumber;
        float product = firstNumber * secondNumber;
        float quotient = secondNumber != 0 ? firstNumber / secondNumber : Float.NaN;

        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);
        if (secondNumber != 0) {
            System.out.printf("Quotient: %.2f%n", quotient);
        } else {
            System.out.println("Quotient: Undefined (division by zero)");
        }

        scanner.close();
    }
}
