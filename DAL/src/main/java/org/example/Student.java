package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private int id;
    private LocalDate createdDate;
    private boolean isActive;
    private String comment;
    private ContactInfo contactInfo;
    private History history;

    //public List<Student> studentsList = new ArrayList<>();/

    public Student()
    {

    }
    public Student(int id, LocalDate createdDate, boolean isActive, String comment, ContactInfo contactInfo, History history) {
        this.id = id;
        this.createdDate = createdDate;
        this.isActive = isActive;
        this.comment = comment;
        this.contactInfo = contactInfo;
        this.history = history;
    }
    public LocalDate createdData(int year, int month, int day)
    {
        LocalDate data = LocalDate.of(year, month, day);
        return data;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && isActive == student.isActive && Objects.equals(createdDate, student.createdDate) && Objects.equals(comment, student.comment) && Objects.equals(contactInfo, student.contactInfo) && Objects.equals(history, student.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdDate, isActive, comment, contactInfo, history);
    }

    @Override
    public String toString() {
        return "---STUDENT---" +
                "\nID: " + getId() +
                "\nCREATED DATE: " + getCreatedDate() +
                "\nIS ACTIVE: " + isActive() +
                "\nCOMMENT: " + getComment() +
                "\nCONTACT INFO: " + getContactInfo() +
                "\nHISTORY: " + getHistory() + "\n";
    }
}
