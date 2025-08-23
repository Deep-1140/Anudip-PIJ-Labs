import java.util.Scanner;

public class Calculator {

    // First method: takes two ints
    public int add(int a, int b) {
        return a + b;
    }

    // Second method: takes three ints
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Third method: takes two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Main method to demonstrate method overloading
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        // Demonstrate first method
        System.out.print("Enter two integers: ");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        System.out.println("Sum of two integers: " + calc.add(x1, x2));

        // Demonstrate second method
        System.out.print("Enter three integers: ");
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int y3 = scanner.nextInt();
        System.out.println("Sum of three integers: " + calc.add(y1, y2, y3));

        // Demonstrate third method
        System.out.print("Enter two doubles: ");
        double z1 = scanner.nextDouble();
        double z2 = scanner.nextDouble();
        System.out.println("Sum of two doubles: " + calc.add(z1, z2));

        scanner.close();
    }
}
