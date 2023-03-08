package org.example;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GetAllStudent getAllStudent = new GetAllStudent();
        GetAllCoach getAllCoach = new GetAllCoach();

        int choice;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Get all students ");
            System.out.println("2. Get all coaches ");
            System.out.println("3. Get student by id");
            System.out.println("4. Get coach by id");
            System.out.println("5. Create student");
            System.out.println("6. Create coach");
            System.out.println("7. Update student");
            System.out.println("8. Update coach");
            System.out.println("9. Delete student");
            System.out.println("10. Delete coach");
            System.out.println("11. Exit");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("All students: ");
                    getAllStudent.displayStudents();
                    break;
                case 2:
                    System.out.println("All coaches: ");
                    getAllCoach.displayCoach();
                    break;
                case 3:
                    System.out.println("Get student: ");
                    getAllStudent.getStdBy();
                    break;
                case 4:
                    System.out.println("Get coach: ");
                    getAllCoach.getCoachBy();
                    break;
                case 5:
                    getAllStudent.createStd();
                    System.out.println("Student is created");
                    break;
                case 6:
                    getAllCoach.createCoach();
                    System.out.println("Coach is created");
                    break;
                case 7:
                    getAllStudent.updateStd();
                    System.out.println("Student is updated");
                    break;
                case 8:
                    getAllCoach.updateCoach();
                    System.out.println("Coach is updated");
                    break;
                case 9:
                    getAllStudent.deleteStd();
                    System.out.println("Student is deleted");
                    break;
                case 10:
                    getAllCoach.deleteCoach();
                    System.out.println("Coach is deleted");
                    break;
                case 11:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 11);
    }
}
