package com.rahul.employees.entity;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeEntity")
public class EmployeeEntity {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String email_Id;

    public EmployeeEntity() {
    }

    public EmployeeEntity(int id, String firstName, String lastName, String email_Id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email_Id = email_Id;
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

    public String getEmail_Id() {
        return email_Id;
    }

    public void setEmail_Id(String email_Id) {
        this.email_Id = email_Id;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email_Id='" + email_Id + '\'' +
                '}';
    }
}
