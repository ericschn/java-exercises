package exercises;

import java.util.Scanner;

public class HelloAsk {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        name = in.next();
        System.out.format("Hello %s!%n", name);
        System.out.println("Hey again " + name + ", this one uses println instead of format");
    }
}
