package org.example;

import org.example.Repositories.CoachRepository;

import java.util.List;

public class CoachService {
    Initializer initializer = new Initializer();
    private CoachRepository coachRepository = new CoachRepository();

    public List<Coach> getAll()
    {
        coachRepository.init();
        return coachRepository.getAll();
    }
    public void getBy(int id)
    {
        coachRepository.getBy(id);
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
