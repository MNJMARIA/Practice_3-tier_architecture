package org.example;

public class GetAllCoach {
    CoachService coachService = new CoachService();
    public void displayCoach()
    {
        for(Coach coach: coachService.GetAllCoaches())
        {
            System.out.println();
            System.out.print(coach.getContactInfo().getFirstName() + "\n" +
                    coach.getContactInfo().getLastName() + "\n" +
                    coach.getContactInfo().getMiddleName() + "\n");
            System.out.println(coach.getHistory().getCourses().getName());
            System.out.println(coach);
        }
    }
}
