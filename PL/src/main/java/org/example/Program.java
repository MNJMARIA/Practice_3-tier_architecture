package org.example;
public class Program {
    public static void main(String[] args) {
        GetAllStudent getAllStudent = new GetAllStudent();
        GetAllCoach getAllCoach = new GetAllCoach();

        getAllStudent.displayStudents();
        getAllCoach.displayCoach();
    }
}
