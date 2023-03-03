package org.example;

import java.util.Objects;

public class Coach {
    private int id;
    private ContactInfo contactInfo;
    private Course courses;
    private History history;

    public Coach()
    {

    }

    public Coach(int id, ContactInfo contactInfo, Course courses, History history) {
        this.id = id;
        this.contactInfo = contactInfo;
        this.courses = courses;
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

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
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
                && Objects.equals(courses, coach.courses)
                && Objects.equals(history, coach.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contactInfo, courses, history);
    }

    @Override
    public String toString() {
        return "---COACH--- " +
                "\nID: " + id +
                "\nCONTACT INFO: " + contactInfo +
                "\nCOURSES: " + courses +
                "\nHISTORY:" + history;
    }
}
