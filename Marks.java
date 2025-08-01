import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] subjects = {"Maths", "Chemistry", "Physics"};

        // Get number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear buffer

        int[][] marks = new int[n][3]; // [student][subject]

        while (true) {
            // Menu
            System.out.println("\n-------- MENU --------");
            System.out.println("add [studentID]           → Add marks");
            System.out.println("update [studentID] [subjectID] → Update mark");
            System.out.println("average [studentID]       → Average per student");
            System.out.println("average_s [subjectID]     → Average per subject");
            System.out.println("total [studentID]         → Total marks");
            System.out.println("exit                      → Exit");
            System.out.print("Enter command: ");

            String input = sc.nextLine();
            String[] cmd = input.split(" ");
}
}
}

           