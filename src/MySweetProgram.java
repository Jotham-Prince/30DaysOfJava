import java.util.Scanner;

public class MySweetProgram {
    public static void main(String[] args) {
        System.out.print("What size of the Array do you want: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] grades = new int[size];

        System.out.println("Enter " + size + " grades (Press Enter after each grade);");

        for (int i = 0; i < grades.length; i++) {
            grades[i] = sc.nextInt();
        }

        System.out.println("\nThe following are the grades you entered;");

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        // Close the scanner
        sc.close();
    }

}
