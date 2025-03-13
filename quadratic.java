import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        float a = scanner.nextFloat();

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero.");
            return;
        }

        System.out.print("Enter coefficient b: ");
        float b = scanner.nextFloat();
        System.out.print("Enter coefficient c: ");
        float c = scanner.nextFloat();

        float delta = b * b - 4 * a * c;
        System.out.printf("Delta: %.2f\n", delta);

        switch (Float.compare(delta, 0)) {
            case 1: // delta > 0
                float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.printf("Roots: x1 = %.2f, x2 = %.2f\n", x1, x2);
                break;
            case 0: // delta == 0
                float x = -b / (2 * a);
                System.out.printf("One root: x = %.2f\n", x);
                break;
            default: // delta < 0
                System.out.println("No real roots.");
        }
    }
}
