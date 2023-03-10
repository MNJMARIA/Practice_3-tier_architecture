package org.example;

import org.example.Repositories.StudentRepository;

import java.util.List;

public class StudentService implements IService<Student> {
    private static StudentRepository studentRepository = new StudentRepository();
    static {
        studentRepository.init();
    }
    @Override
    public List<Student> getAll()
    {
        return studentRepository.getAll();
    }
    @Override
    public Student getBy(int id)
    {
        return studentRepository.getBy(id);
    }
    @Override
    public void create(Student student)
    {
        studentRepository.create(student);
    }
    @Override
    public void update(int id, Student student)
    {
        studentRepository. update(id, student);
    }
    @Override
    public void delete(int id)
    {
        studentRepository.delete(id);
    }
}

