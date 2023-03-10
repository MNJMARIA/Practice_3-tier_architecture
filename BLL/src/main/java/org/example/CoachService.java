package org.example;

import org.example.Repositories.CoachRepository;

import java.util.List;

public class CoachService implements IService<Coach> {
    private static CoachRepository coachRepository = new CoachRepository();

    static {
        coachRepository.init();
    }
    @Override
    public List<Coach> getAll()
    {
        return coachRepository.getAll();
    }
    @Override
    public Coach getBy(int id)
    {
        return coachRepository.getBy(id);
    }
    @Override
    public void create(Coach coach)
    {
        coachRepository.create(coach);
    }
    @Override
    public void update(int id, Coach coach)
    {
        coachRepository.update(id, coach);
    }
    @Override
    public void delete(int id)
    {
        coachRepository.delete(id);
    }

}
