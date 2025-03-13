import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        float heightAftab = scanner.nextFloat();

        System.out.print("Enter your weight in kg: ");
        float weightAftab = scanner.nextFloat();

        float bmi = (float) (weightAftab / Math.pow(heightAftab, 2));
        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi < 16) {
            System.out.println("Starvation");
        } else if (bmi < 17) {
            System.out.println("Emaciation");
        } else if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 23) {
            System.out.println("Normal, low range");
        } else if (bmi < 25) {
            System.out.println("Normal, high range");
        } else if (bmi < 27.5) {
            System.out.println("Overweight, low range");
        } else if (bmi < 30) {
            System.out.println("Overweight, high range");
        } else if (bmi < 35) {
            System.out.println("1st degree obesity");
        } else if (bmi < 40) {
            System.out.println("2nd degree obesity");
        } else {
            System.out.println("3rd degree obesity");
        }
    }
}


