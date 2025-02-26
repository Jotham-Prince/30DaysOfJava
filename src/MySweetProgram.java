import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class MySweetProgram {
    public static void main(String[] args) throws Exception {
        System.out.println("Fetching students from \"students.txt\"...");
        Scanner sc = new Scanner(new File("students.txt"));
        List<String> students = new ArrayList<String>();

        while (sc.hasNextLine()) {
            students.add(sc.nextLine());
        }
        // Close the scanner
        sc.close();

        System.out.println("The following are the students in your class;");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

}
