package org.example;

import org.example.Repositories.StudentRepository;

import java.util.List;

public class StudentsService {
    private Initializer initializer = new Initializer();
    private StudentRepository studentRepository = new StudentRepository();

    public List<Student> getAll()
    {
        studentRepository.init();
        return studentRepository.getAll();
    }
    public void getBy(int id)
    {
        studentRepository.getBy(id);
    }
    public void create(Student student)
    {
        studentRepository.create(student);
    }
    public void update(int id, Student student)
    {
        studentRepository. update(id, student);
    }
    public void delete(int id)
    {
        studentRepository.delete(id);
    }

}
