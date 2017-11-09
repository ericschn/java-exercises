package exercises;

import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an int");
        int x = in.nextInt();
        System.out.println(x);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
