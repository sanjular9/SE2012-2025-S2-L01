import java.util.Scanner;

public class MarksDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3]; // [Maths, Chemistry, Physics]

        boolean running = true;

        while (running) {
            System.out.println("\n===== STUDENT MARKS MENU =====");
            System.out.println("1. Add marks for a student");
            System.out.println("2. Update a subject mark for a student");
            System.out.println("3. Get average mark of a subject");
            System.out.println("4. Get average mark of a student");
            System.out.println("5. Get total marks of a student");
            System.out.println("6. Display grades of all students");
            System.out.println("7. Exit");
            System.out.print("Choose an option (1-7): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID (1 to " + n + "): ");
                    int id = sc.nextInt();
                    if (id < 1 || id > n) {
                        System.out.println("❌ Invalid student ID.");
                        break;
                    }

                    System.out.println("Enter marks for:");
                    System.out.print(" - Mathematics: ");
                    marks[id - 1][0] = sc.nextInt();
                    System.out.print(" - Chemistry: ");
                    marks[id - 1][1] = sc.nextInt();
                    System.out.print(" - Physics: ");
                    marks[id - 1][2] = sc.nextInt();

                    System.out.println("✅ Marks added successfully for student " + id);
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    id = sc.nextInt();
                    if (id < 1 || id > n) {
                        System.out.println("❌ Invalid student ID.");
                        break;
                    }

                    System.out.println("Which subject to update?");
                    System.out.println("1. Mathematics\n2. Chemistry\n3. Physics");
                    System.out.print("Choose subject (1-3): ");
                    int subjectID = sc.nextInt();
                    if (subjectID < 1 || subjectID > 3) {
                        System.out.println("❌ Invalid subject ID.");
                        break;
                    }

                    System.out.print("Enter new mark: ");
                    marks[id - 1][subjectID - 1] = sc.nextInt();
                    System.out.println("✅ Mark updated.");
                    break;

                case 3:
                    System.out.println("Which subject?");
                    System.out.println("1. Mathematics\n2. Chemistry\n3. Physics");
                    System.out.print("Choose subject (1-3): ");
                    subjectID = sc.nextInt();
                    if (subjectID < 1 || subjectID > 3) {
                        System.out.println("❌ Invalid subject ID.");
                        break;
                    }

                    double subjectSum = 0;
                    for (int i = 0; i < n; i++) {
                        subjectSum += marks[i][subjectID - 1];
                    }
                    System.out.printf("📊 Average for subject %d: %.2f\n", subjectID, subjectSum / n);
                    break;

                case 4:
                    System.out.print("Enter student ID: ");
                    id = sc.nextInt();
                    if (id < 1 || id > n) {
                        System.out.println("❌ Invalid student ID.");
                        break;
                    }

                    int total = 0;
                    for (int i = 0; i < 3; i++) {
                        total += marks[id - 1][i];
                    }
                    System.out.printf("📊 Average for student %d: %.2f\n", id, total / 3.0);
                    break;

                case 5:
                    System.out.print("Enter student ID: ");
                    id = sc.nextInt();
                    if (id < 1 || id > n) {
                        System.out.println("❌ Invalid student ID.");
                        break;
                    }

                    total = 0;
                    for (int i = 0; i < 3; i++) {
                        total += marks[id - 1][i];
                    }
                    System.out.printf("📋 Total marks for student %d: %d\n", id, total);
                    break;

                case 6:
                    // Display grades
                    System.out.println("\n====== STUDENT GRADES SUMMARY ======");
                    System.out.printf("%-10s %-10s %-10s %-10s\n", "Student", "Maths", "Chem", "Physics");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("%-10d %-10s %-10s %-10s\n",
                                (i + 1),
                                getGrade(marks[i][0]),
                                getGrade(marks[i][1]),
                                getGrade(marks[i][2]));
                    }
                    break;

                case 7:
                    running = false;
                    System.out.println("👋 Exiting... Thank you!");
                    break;

                default:
                    System.out.println("❌ Invalid option. Please try again.");
            }
        }

        sc.close();
    }

    // Grade evaluation method
    public static String getGrade(int mark) {
        if (mark >= 90) return "Grade A";
        else if (mark >= 80) return "Grade B";
        else if (mark >= 70) return "Grade C";
        else if (mark >= 60) return "Grade D";
        else return "Fail";
    }
}
