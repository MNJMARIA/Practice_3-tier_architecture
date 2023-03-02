package org.example;

import java.util.List;

public class StudentsService {
    Initializer initializer = new Initializer();
    public List<Student> GetAllStudent()
    {
        initializer.init();
        return initializer.getStudents();
    }


}
