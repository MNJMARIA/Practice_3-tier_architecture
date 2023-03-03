package org.example;

import java.util.Objects;

public class History {
    private int id;
    private Course courses;

    public History()
    {

    }
    public History(int id, Course courses) {
        this.id = id;
        this.courses = courses;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        History history = (History) o;
        return id == history.id && Objects.equals(courses, history.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courses);
    }

    @Override
    public String toString() {
        return "id = " + id +
                "; courses: " + courses + '.';
    }
}
