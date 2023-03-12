package org.example;

public class AllCoachFunctions {
    private ContactInfo contactInfo = new ContactInfo();
    private IService<Coach> coachService = new CoachService();
    public void displayCoach()
    {
        for(Coach coach: coachService.getAll())
        {
            System.out.println(coach);
        }
        System.out.println("");
    }
    public void getCoachBy()
    {
        System.out.println(coachService.getBy(1));
    }
    public void createCoach()
    {
        coachService.create(new Coach( 2, new ContactInfo(2, "Alex", "Kozak", "Petrovich",
                contactInfo.birthData(1990, 5,20), "kozak@gmail.com", "380920005020"),
                new Course(2, "SQL", 11000, 40),
                new History(2, new Course(2,"C#", 25000, 50))));
    }
    public void updateCoach()
    {
        coachService.update(1, new Coach( 1, new ContactInfo(3, "Oleg", "Petrov", "Ivanovich",
                contactInfo.birthData(1988, 9,18), "olegpetrov@gmail.com", "380923652323"),
                new Course(3, "Java", 12500, 56),
                new History(3, new Course(2,"Java Dev", 28000, 60))));
    }

    public void deleteCoach()
    {
        coachService.delete(2);
    }
}
