package org.example;

public class Course {
    private int id;
    private String name;
    private double price;
    private int lessonCount;

    public Course(int id, String name, double price, int lessonCount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.lessonCount = lessonCount;
    }

    @Override
    public String toString() {
        return "Course: " +
                "id=" + id +
                ", name='" + name + ';' +
                ", price=" + price + ';' +
                ", lessonCount=" + lessonCount + '.';
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
}
