package exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class SumEven {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        int result = sumOfEven(nums);
        System.out.println(result);
    }

    public static int sumOfEven(ArrayList<Integer> arg) {

        int summed = 0;

        for (int num : arg) {
            summed += num;
        }

        return summed;
    }
}
