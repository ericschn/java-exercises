package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHash {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        Integer newStudentID = 1;
        String newStudentName = "PLACEHOLDER";

        System.out.println("Enter ID followed by student name (enter ID as 0 to finish)");

        while (newStudentID != 0) {
            System.out.print("Student ID: ");
            newStudentID = in.nextInt();
            if (newStudentID == 0) break;

            in.nextLine();
            System.out.print("Student Name: ");
            newStudentName = in.next();
            students.put(newStudentID, newStudentName);

            in.nextLine();
        }

        System.out.println("Class Roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " - " + student.getValue());
        }

    }
}
