package org.example;

public class GetAllCoach {
    CoachService coachService = new CoachService();
    public void displayCoach()
    {
        for(Coach coach: coachService.getAll())
        {
            System.out.println(coach);
        }
    }
}
