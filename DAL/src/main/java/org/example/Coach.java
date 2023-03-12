package org.example;

import java.util.Objects;

public class Coach {
    private int id;
    private ContactInfo contactInfo;
    private Course course;
    private History history;

    public Coach()
    {

    }

    public Coach(int id, ContactInfo contactInfo, Course course, History history) {
        this.id = id;
        this.contactInfo = contactInfo;
        this.course = course;
        this.history = history;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coach coach = (Coach) o;
        return id == coach.id
                && Objects.equals(contactInfo, coach.contactInfo)
                && Objects.equals(course, coach.course)
                && Objects.equals(history, coach.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contactInfo, course, history);
    }

    @Override
    public String toString() {
        return "---COACH--- " +
                "\nID: " + id +
                "\nCONTACT INFO: " + contactInfo +
                "\nCOURSE: " + course +
                "\nHISTORY:" + history;
    }
}
