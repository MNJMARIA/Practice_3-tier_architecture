package org.example.Repositories;

import org.example.Coach;
import org.example.Initializer;
import java.util.ArrayList;
import java.util.List;

public class CoachRepository implements IRepository<Coach> {
    private List<Coach> coachList = new ArrayList<>();
    private Initializer initializer = new Initializer();

    public void init()
    {
        initializer.init();
        coachList = initializer.getCoach();
    }
    @Override
    public List<Coach> getAll()
    {
        return coachList;
    }
    @Override
    public Coach getBy(int id)
    {
        for (Coach coach : coachList) {
            if (coach.getId() == id) {
                return coach;
            }
        }
        return null;
    }
    @Override
    public void create(Coach coach)
    {
        coachList.add(coach);
    }
    @Override
    public void update(int id, Coach coach)
    {
        for (int i = 0; i < coachList.size(); i++) {
            if(coachList.get(i).getId() == id)
            {
                coachList.set(i, coach);
                break;
            }
        }
    }
    @Override
    public void delete(int id)
    {
        for (int i = 0; i < coachList.size(); i++) {
            if(coachList.get(i).getId() == id)
            {
                coachList.remove(i);
                break;
            }
        }
    }
}
