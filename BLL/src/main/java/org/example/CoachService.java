package org.example;

import java.util.List;

public class CoachService {
    Initializer initializer = new Initializer();
    public List<Coach> GetAllCoaches()
    {
        initializer.init();
        return initializer.getCoach();
    }
}
