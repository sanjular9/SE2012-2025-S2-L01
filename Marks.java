import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3]; // [Maths, Chemistry, Physics]

        boolean running = true;

        while (running) {
            // Show user-friendly menu
            System.out.println("\n===== STUDENT MARKS MENU =====");
            System.out.println("1. Add marks for a student");
            System.out.println("2. Update a subject mark for a student");
            System.out.println("3. Get average mark of a subject");
            System.out.println("4. Get average mark of a student");
            System.out.println("5. Get total marks of a student");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Add marks
                    System.out.print("Enter student ID (1 to " + n + "): ");
                    int id = sc.nextInt();
                    if (id < 1 || id > n) {
                        System.out.println(" Invalid student ID.");
                        break;
                    }

                    System.out.println("Enter marks for:");
                    System.out.print(" - Mathematics: ");
                    marks[id - 1][0] = sc.nextInt();
                    System.out.print(" - Chemistry: ");
                    marks[id - 1][1] = sc.nextInt();
                    System.out.print(" - Physics: ");
                    marks[id - 1][2] = sc.nextInt();

                    System.out.println(" Marks added successfully for student " + id);
                    break;

                case 2: // Update a subject mark
                    System.out.print("Enter student ID: ");
                    id = sc.nextInt();
                    if (id < 1 || id > n) {
                        System.out.println(" Invalid student ID.");
                        break;
                    }

                    System.out.println("Which subject to update?");
                    System.out.println("1. Mathematics\n2. Chemistry\n3. Physics");
                    System.out.print("Choose subject (1-3): ");
                    int subjectID = sc.nextInt();
                    if (subjectID < 1 || subjectID > 3) {
                        System.out.println(" Invalid subject ID.");
                        break;
                    }

                    System.out.print("Enter new mark: ");
                    marks[id - 1][subjectID - 1] = sc.nextInt();
                    System.out.println(" Mark updated.");
                    break;

                case 3: // Average for a subject
                    System.out.println("Which subject?");
                    System.out.println("1. Mathematics\n2. Chemistry\n3. Physics");
                    System.out.print("Choose subject (1-3): ");
                    subjectID = sc.nextInt();
                    if (subjectID < 1 || subjectID > 3) {
                        System.out.println(" Invalid subject ID.");
                        break;
                    }

                    double subjectSum = 0;
                    for (int i = 0; i < n; i++) {
                        subjectSum += marks[i][subjectID - 1];
                    }
                    System.out.printf("📊 Average for subject %d: %.2f\n", subjectID, subjectSum / n);
                    break;

                case 4: // Average for a student
                    System.out.print("Enter student ID: ");
                    id = sc.nextInt();
                    if (id < 1 || id > n) {
                        System.out.println(" Invalid student ID.");
                        break;
                    }

                    int total = 0;
                    for (int i = 0; i < 3; i++) {
                        total += marks[id - 1][i];
                    }
                    System.out.printf(" Average for student %d: %.2f\n", id, total / 3.0);
                    break;

                case 5: // Total for a student
                    System.out.print("Enter student ID: ");
                    id = sc.nextInt();
                    if (id < 1 || id > n) {
                        System.out.println(" Invalid student ID.");
                        break;
                    }

                    total = 0;
                    for (int i = 0; i < 3; i++) {
                        total += marks[id - 1][i];
                    }
                    System.out.printf(" Total marks for student %d: %d\n", id, total);
                    break;

                case 6: // Exit
                    running = false;
                    System.out.println(" Exiting... Thank you!");
                    break;

                default:
                    System.out.println(" Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}
