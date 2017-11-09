package exercises;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        float miles;
        float gallons;
        float mpg;
        Scanner in = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        miles = in.nextFloat();

        System.out.println("How many gallons of gas have you used?");
        gallons = in.nextFloat();

        mpg = miles / gallons;

        System.out.format("Your MPG is: %f", mpg);
    }



}
