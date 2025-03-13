//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;

public class findingnumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int count = 10;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (count > 0) {
            int num = random.nextInt(100) + 1; // Random number from 1 to 100
            System.out.print(num + " ");
            if (num < min) min = num;
            if (num > max) max = num;
            count--;
        }

        System.out.println("\nSmallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
