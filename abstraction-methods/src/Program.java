import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        byte choice;

        do {
            System.out.println("\n1. Square \n2. Rectangular \n0. Quit");
            System.out.println("Choose an option: ");
            choice = stdin.nextByte();

            switch (choice) {
                case 1:
                    System.out.println("Enter side of square: ");
                    double side = stdin.nextDouble();

                    try {
                        Square square = new Square(side);
                        System.out.println("Area of the square: " + square.calcArea());
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter width of rectangular: ");
                    double width = stdin.nextDouble();
                    System.out.println("Enter length of rectangular: ");
                    double length = stdin.nextDouble();

                    try {
                        Rectangular rectangular = new Rectangular(width, length);
                        System.out.println("Area of the rectangular: " + rectangular.calcArea());
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Quitting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
            }

        } while (choice != 0);

    }
}
