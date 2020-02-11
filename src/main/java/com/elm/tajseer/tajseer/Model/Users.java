package com.elm.tajseer.tajseer.Model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId ;
    @Column
    private String fullName ;
    @Column
    private String PhoneNumber ;
    @Column
    private Date dateOfBirth ;
    @Column
    private String email ;
    @Column
    private String password ;
    private String nationalId ;
    @ManyToOne
    @JoinColumn(name = "authorityId")
    private  Authority authority ;


    @OneToMany(targetEntity = Certificates.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "CertificateId", referencedColumnName = "CertificateId")
    private  Certificates certificates ;

    public Users() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
}
