package org.example;

public class GetAllStudent {
    StudentsService studentsService = new StudentsService();
    public void displayStudents()
    {
        for(Student std: studentsService.GetAllStudent())
        {
            System.out.println(std.getContactInfo().getFirstName() + "\n" +
                    std.getContactInfo().getLastName() + "\n" +
                    std.getContactInfo().getMiddleName() + "\n");

            System.out.println(std.getHistory().getCourses().getName());
        }
    }
}
