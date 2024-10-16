
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        String color = " ";
        Scanner input = new Scanner(System.in);


        System.out.println("Choose 1 : ");
        System.out.println("1. Rectangle\n2. Circle");
        String pilihan = input.nextLine();

        if (pilihan.equalsIgnoreCase("2")) {
            System.out.println("Circle Details: ");
            System.out.println("Radius: ");
            int radius = input.nextInt();
            input.nextLine();
            Circle circle = new Circle("Circle", color, radius);
            circle.print();
        } else if (pilihan.equalsIgnoreCase("1")) {
            System.out.println("Choose 2 : ");
            System.out.println("1. Cube\n2. Rectangle");
            String pilihan2 = input.nextLine();
            System.out.println("Rectangle Details: ");
            System.out.println("Length: ");
            int length = input.nextInt();
            input.nextLine();
            System.out.println("Width: ");
            int width = input.nextInt();
            input.nextLine();
            Rectangle rectangle = new Rectangle("Rectangle", color, length, width);
            rectangle.print();

            if (pilihan.equalsIgnoreCase("1")) {
                System.out.println("Cube details: ");
                System.out.println("height: ");
                int height = input.nextInt();
                Cube cube = new Cube( "cube", color, length, width, height);
                cube.print();
            }
        }

    }
}