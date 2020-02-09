package com.elm.tajseer.tajseer.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Users {

    @Id
    private int NationalId ;
    @Column
    private String FirstName ;
    @Column
    private  String LastName ;
    @Column
    private String PhoneNumber ;
    @Column
    private Date BirthDay ;
    @Column
    private String Email ;
    @Column
    private String Password ;

    public Users() {

    }

    public int getNationalId() {
        return NationalId;
    }

    public void setNationalId(int nationalId) {
        NationalId = nationalId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Date getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(Date birthDay) {
        BirthDay = birthDay;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
