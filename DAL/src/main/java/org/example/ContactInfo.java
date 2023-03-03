package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class ContactInfo {
    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthdate;
    private String email;
    private String phone;

    public ContactInfo()
    {

    }
    public ContactInfo(int id, String firstName, String lastName, String middleName, LocalDate birthdate, String email, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthdate = birthdate;
        this.email = email;
        this.phone = phone;
    }
    public LocalDate birthData(int year, int month, int day)
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

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactInfo that = (ContactInfo) o;
        return id == that.id && Objects.equals(firstName, that.firstName)
                && Objects.equals(lastName, that.lastName)
                && Objects.equals(middleName, that.middleName)
                && Objects.equals(birthdate, that.birthdate)
                && Objects.equals(email, that.email)
                && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, middleName, birthdate, email, phone);
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", firstName = " + firstName +
                ", lastName = " + lastName +
                ", middleName = " + middleName +
                ", \nbirthdate = " + birthdate +
                ", email = " + email +
                ", phone = " + phone + '.';
    }
}

