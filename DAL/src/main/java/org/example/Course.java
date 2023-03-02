package org.example;

import java.util.Objects;

public class Course {
    private int id;
    private String name;
    private double price;
    private int lessonCount;

    public Course()
    {

    }

    public Course(int id, String name, double price, int lessonCount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.lessonCount = lessonCount;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getLessonCount() {
        return lessonCount;
    }
    public void setLessonCount(int lessonCount) {
        this.lessonCount = lessonCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id
                && Double.compare(course.price, price) == 0
                && lessonCount == course.lessonCount
                && Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, lessonCount);
    }

    @Override
    public String toString() {
        return "Course: " +
                "id=" + id +
                ", name='" + name + ';' +
                ", price=" + price + ';' +
                ", lessonCount=" + lessonCount + '.';
    }
}
