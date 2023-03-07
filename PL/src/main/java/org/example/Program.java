package org.example;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GetAllStudent getAllStudent = new GetAllStudent();

        int choice;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Get all students");
            System.out.println("2. Get student by id");
            System.out.println("3. Create student");
            System.out.println("4. Update student");
            System.out.println("5. Delete student");
            System.out.println("6. Exit");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    getAllStudent.displayStudents();
                    break;
                case 2:
                    getAllStudent.getStdBy();
                    break;
                case 3:
                    getAllStudent.createStd();
                    break;
                case 4:
                    getAllStudent.updateStd();
                    break;
                case 5:
                    getAllStudent.deleteStd();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }
}
