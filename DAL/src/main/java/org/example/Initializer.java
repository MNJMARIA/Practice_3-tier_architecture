package org.example;

import java.util.ArrayList;
import java.util.List;

public class Initializer {
    Student std = new Student();
    ContactInfo contactInfo = new ContactInfo();
    private List<Student> studentsList = new ArrayList<>();
    private List<Coach> coachList = new ArrayList<>();

    public void addStudent(Student student)
    {
        studentsList.add(student);
    }
    public void addCoach(Coach coach)
    {
        coachList.add(coach);
    }

    private void initModels()
    {
       addStudent(new Student(1, std.createdData(2023, 01, 12), true, "quality education",
                new ContactInfo(1, "Maria", "Stepanova", "Oleksandrivna",
                contactInfo.birthData(2005,8,4 ), "mariastepanova@kitu.nau.edu.ua", "380998882828"),
                new History(1, new Course(1, "Java", 12346, 1))));
        /*addStudent(new Student(std.setId(1), std.createdData(2022,10,4), std.setActive(true), std.setComment("hard learner"),
                new ContactInfo(1, "Maria", "Stepanova", "Oleksandrivna", contactInfo.birthData(2005,8,4 ), "mariastepanova@kitu.nau.edu.ua", "380998882828"),
                new History(1, new Course(1, "Java", 12346, 1))));*/
       addCoach(new Coach( 1, new ContactInfo(2, "Oleg", "Ivanov", "Petrovich",
                contactInfo.birthData(1980, 9,18), "olegivanov@gmail.com", "380923652323"),
                new Course(2, "Java", 12346, 56),
                new History(2, new Course(2,"Java Dev", 28000, 60))));
    }
    public void init()
    {
        initModels();
    }
    public List<Student> getStudents()
    {
        return studentsList;
    }
    public List<Coach> getCoach()
    {
        return coachList;
    }
}
