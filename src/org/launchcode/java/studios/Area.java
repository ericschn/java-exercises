package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        float pi = 3.14f;
        float r;
        float area;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("What is the radius of the circle?");
            while (!in.hasNextFloat()) {
                System.out.println("Invalid entry, please enter positive float.");
                in.next();
            }
            r = in.nextFloat();
        } while (r <= 0);

        area = pi * r * r;

        System.out.format("The area of a circle with a radius of %.2f is %.2f", r, area);

    }

}
