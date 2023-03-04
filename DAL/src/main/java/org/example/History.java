package org.example;

import java.util.Objects;

public class History {
    private int id;
    private Course course;

    public History()
    {

    }
    public History(int id, Course course) {
        this.id = id;
        this.course = course;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Course getCourses() {
        return course;
    }
    public void setCourses(Course course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        History history = (History) o;
        return id == history.id && Objects.equals(course, history.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, course);
    }

    @Override
    public String toString() {
        return "id = " + id +
                "; course: " + course + '.';
    }
}
