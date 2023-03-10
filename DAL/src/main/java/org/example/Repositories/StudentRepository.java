package org.example.Repositories;

import org.example.Initializer;
import org.example.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IRepository<Student> {
    private List<Student> studentsList = new ArrayList<>();
    private Initializer initializer = new Initializer();

    public void init()
    {
        initializer.init();
        studentsList = initializer.getStudents();
    }

    @Override
    public List<Student> getAll()
    {
        return studentsList;
    }

    @Override
    public Student getBy(int id)
    {
        for (Student student : studentsList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }


    @Override
    public void create(Student student)
    {
        studentsList.add(student);
    }

    @Override
    public void update(int id, Student student)
    {
        for (int i = 0; i < studentsList.size(); i++) {
            if(studentsList.get(i).getId() == id)
            {
                studentsList.set(i, student);
                break;
            }
        }

    }

    @Override
    public void delete(int id)
    {
        for (int i = 0; i < studentsList.size(); i++) {
            if(studentsList.get(i).getId() == id)
            {
                studentsList.remove(i);
                break;
            }
        }
    }
}


