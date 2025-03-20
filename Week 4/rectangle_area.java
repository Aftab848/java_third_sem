import java.util.Scanner;

class RectangleArea {
    private double length;
    private double width;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }

    public double computeField() {
        return length * width;
    }

    public void fieldDisplay() {
        System.out.println("The area of the rectangle is: " + computeField());
    }
}

public class Main {
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();
        rectangle.getData();
        rectangle.fieldDisplay();
    }
}
