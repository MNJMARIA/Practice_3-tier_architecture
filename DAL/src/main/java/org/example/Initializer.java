package org.example;

import java.util.ArrayList;
import java.util.List;

public class Initializer {
    Student student = new Student();
    ContactInfo contactInfo = new ContactInfo();
    public List<Student> studentsList = new ArrayList<>();


    public void addStudent(Student student)
    {
        studentsList.add(student);
    }

    private void initModels()
    {
        addStudent(new Student(1, student.createdData(2023, 01, 12), true, "hard learner",
                new ContactInfo(1, "Maria", "Stepanova", "Oleksandrivna", contactInfo.birthData(2005,8,4 ), "mariastepanova@kitu.nau.edu.ua", "380998882828"),
                new History(1, new Course(1, "Java", 12346, 1))));

    }
    public void init()
    {
        initModels();
    }
    public List<Student> getStudents()
    {
        return studentsList;
    }
}
