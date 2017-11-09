package exercises;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        float w;
        float h;
        float result;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("What is the width of the rectangle?");
            while (!in.hasNextFloat()) {
                System.out.println("Invalid entry, please enter positive float.");
                in.next();
            }
            w = in.nextFloat();
        } while (w <= 0);

        do {
            System.out.println("What is the height of the rectangle?");
            while (!in.hasNextFloat()) {
                System.out.println("Invalid entry, please enter positive float.");
                in.next();
            }
            h = in.nextFloat();
        } while (h <= 0);

        result = w * h;

        System.out.format("The area of the Rectangle is: %f%n", result);

    }
}
