package org.example.Repositories;

import org.example.Coach;
import org.example.Initializer;
import org.example.Student;

import java.util.ArrayList;
import java.util.List;

public class CoachRepository {
    private List<Coach> coachList = new ArrayList<>();
    private Initializer initializer = new Initializer();

    public void init()
    {
        initializer.init();
        coachList = initializer.getCoach();
    }

    public List<Coach> getAll()
    {
        return coachList;
    }
    public Coach getBy(int id)
    {
        return coachList.get(id);
    }
    public void create(Coach coach)
    {
        coachList.add(coach);
    }
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
