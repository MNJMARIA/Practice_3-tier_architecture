package org.example;

import org.example.Repositories.CoachRepository;

import java.util.List;

public class CoachService {
    private static CoachRepository coachRepository = new CoachRepository();

    static {
        coachRepository.init();
    }

    public List<Coach> getAll()
    {
        return coachRepository.getAll();
    }
    public Coach getBy(int id)
    {
        return coachRepository.getBy(id);
    }
    public void create(Coach coach)
    {
        coachRepository.create(coach);
    }
    public void update(int id, Coach coach)
    {
        coachRepository.update(id, coach);
    }
    public void delete(int id)
    {
        coachRepository.delete(id);
    }

}
