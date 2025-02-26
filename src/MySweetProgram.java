import java.util.Scanner;

public class MySweetProgram {
    public static void main(String[] args) {
        System.out.print("Name yourself: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.equals("Jotham Prince")) {
            System.out.println("Welcome, Sir Jotham");

            for (int i = 1; i <= 10; i++) {
                System.out.println("i = " + i);
            }

        } else {
            System.out.println(s + " you're not welcome here!");
        }

        // Close the scanner
        scan.close();
    }

}
