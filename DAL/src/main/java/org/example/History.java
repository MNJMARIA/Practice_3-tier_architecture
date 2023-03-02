package org.example;

public class History {
    private int id;
    private Course courses;

    public History(int id, Course courses) {
        this.id = id;
        this.courses = courses;
    }
    public History()
    {

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Course getCourses() {
        return courses;
    }
    public void setCourses(Course courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "History: " +
                "id: " + id +
                ", courses: " + courses + '.';
    }
}
