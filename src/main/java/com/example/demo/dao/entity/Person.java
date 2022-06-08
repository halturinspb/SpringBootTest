package com.example.demo.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="persons")
public class Person {

    @Id
    @Column (name="id")
    private int id;

    @Column (name="first_name")
    private String firstName;

    @Column (name="last_name")
    private String lastName;

    @Column (name="passport_number")
    private int passportNumber;

//    @Column (name="gender_type")
//    private GenderType genderType;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, int passportNumber, GenderType genderType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
//        this.genderType = genderType;
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

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

//    public GenderType getGenderType() {
//        return genderType;
//    }
//
//    public void setGenderType(GenderType genderType) {
//        this.genderType = genderType;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportNumber=" + passportNumber +
//                ", genderType=" + genderType +
                '}';
    }
}
