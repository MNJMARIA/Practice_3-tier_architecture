package org.example;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AllStudentFunctions studentFunctions = new AllStudentFunctions();
        AllCoachFunctions coachFunctions = new AllCoachFunctions();

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
                    studentFunctions.displayStudents();
                    break;
                case 2:
                    System.out.println("All coaches: ");
                    coachFunctions.displayCoach();
                    break;
                case 3:
                    System.out.println("Get student: ");
                    studentFunctions.getStdBy();
                    break;
                case 4:
                    System.out.println("Get coach: ");
                    coachFunctions.getCoachBy();
                    break;
                case 5:
                    studentFunctions.createStd();
                    System.out.println("Student is created");
                    break;
                case 6:
                    coachFunctions.createCoach();
                    System.out.println("Coach is created");
                    break;
                case 7:
                    studentFunctions.updateStd();
                    System.out.println("Student is updated");
                    break;
                case 8:
                    coachFunctions.updateCoach();
                    System.out.println("Coach is updated");
                    break;
                case 9:
                    studentFunctions.deleteStd();
                    System.out.println("Student is deleted");
                    break;
                case 10:
                    coachFunctions.deleteCoach();
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
