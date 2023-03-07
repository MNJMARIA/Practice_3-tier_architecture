package org.example;

public class GetAllStudent {
    private Student std = new Student();
    private ContactInfo contactInfo = new ContactInfo();
    private StudentsService studentsService = new StudentsService();
    public void displayStudents()
    {
        for(Student std: studentsService.getAll())
        {
            System.out.println(std);
        }
    }
    public void getStdBy()
    {
        studentsService.getBy(2);
    }
    public void createStd()
    {
        studentsService.create(new Student(2, std.createdData(2022, 12, 05), true, "fast and useful course",
                new ContactInfo(2, "Sophia", "Kim", "Andriivna",
                        contactInfo.birthData(2005,01,17 ), "sophikim@gmail.com", "380999998866"),
                new History(2, new Course(2, "Front-end", 20300, 45))));
    }
    public void updateStd()
    {
        studentsService.update(1, new Student(3, std.createdData(2023, 01, 12), true, "quality education",
                new ContactInfo(3, "Mia", "Stepanova", "Oleksiivna",
                        contactInfo.birthData(2005,8,5 ), "miaoleksiivna@ukr.net", "380998882828"),
                new History(3, new Course(3, "Java", 12346, 1))));
    }

   public void deleteStd()
   {
       studentsService.delete(1);
   }
}
