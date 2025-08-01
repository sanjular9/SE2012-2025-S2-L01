import java.util.Scanner;

public class GradesSummary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subjects = {"Maths", "Chemistry", "Physics"};

        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear buffer

        int[][] marks = new int[n][3]; // [student][subject]

        // Get marks from user
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Display grade summary
        System.out.println("\n--- Student Grades Summary ---");
        System.out.printf("%-10s %-12s %-12s %-12s%n", "StudentID", "Maths", "Chemistry", "Physics");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d", i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-12s", getGrade(marks[i][j]));
            }
            System.out.println();
        }

        sc.close();
    }

    // Grade calculation method
    public static String getGrade(int mark) {
        if (mark >= 90)
            return "Grade A";
        else if (mark >= 80)
            return "Grade B";
        else if (mark >= 70)
            return "Grade C";
        else if (mark >= 60)
            return "Grade D";
        else
            return "Fail";
    }
}