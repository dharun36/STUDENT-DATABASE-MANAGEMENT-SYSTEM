import database.Database;

import java.util.Scanner;

public class DatabaseManagement extends Database {

    public static void main(String[] args) {
        DatabaseManagement db = new DatabaseManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Database Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter Mark (0-100): ");
                    int mark = scanner.nextInt();

                    db.addStudent(id, name, age, mark);
                    break;

                case 2:
                    db.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = scanner.nextInt();
                    db.searchStudent(searchId);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
