package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private LocalDate createdDate;
    private boolean isActive;
    private String comment;
    private ContactInfo contactInfo;
    private History history;

    //public List<Student> studentsList = new ArrayList<>();/
    public Student(int id, LocalDate createdDate, boolean isActive, String comment, ContactInfo contactInfo, History history) {
        this.id = id;
        this.createdDate = createdDate;
        this.isActive = isActive;
        this.comment = comment;
        this.contactInfo = contactInfo;
        this.history = history;
    }

    public Student()
    {}



    public LocalDate createdData(int year, int month, int day)
    {
        LocalDate data = LocalDate.of(year, month, day);
        return data;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\tcreatedDate: " + createdDate +
                "\tisActive: " + isActive +
                "\tcomment: " + comment  +
                "\tcontactInfo: " + contactInfo +
                "\thistory: " + history + "\n";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public History getHistory() {
        return history;
    }
    public void setHistory(History history) {
        this.history = history;
    }
}
