package com.elm.tajseer.tajseer.Model;


import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.security.cert.Certificate;
import java.util.*;

@Entity
@Table
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId ;

    @Column
    @Size(min = 3,message = "Too Short Name")
    @Size(max = 30,message = "Too Long Name")
    private String fullName ;

    @Column
   // @NotNull(message = "Phone Number Cannot be null.")
    private String PhoneNumber ;

    @Column
   // @Past(message = "Date input is invalid for a birth date.")
    private Date dateOfBirth ;

    @Column
    @NotNull(message = "Name cannot be null.")
    @Email(message = "Enter a valid email address.")
    private String email;

    @Column
    @NotNull(message = "Name cannot be null.")
    @Size(min = 8,message = "Too Short Password")
    private String password ;

    @Column
    private String nationalId ;

    @Column
    private boolean enabled ;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Certificates> certificates = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AuthorityId")
    private Authority authority;
//
//    @ManyToMany(mappedBy = "users", cascade = {CascadeType.ALL})
//    private Authority authority;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "organizationId")
    private Organization organization;



    @OneToMany(mappedBy = "userShareds", cascade = CascadeType.ALL)
    private List<Shared> shareds = new ArrayList<>();


    public Users() {
    }


    public Users(int userId, String fullName, String phoneNumber, Date dateOfBirth, String email, String password, String nationalId, boolean enabled) {
        this.userId = userId;
        this.fullName = fullName;
        PhoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
        this.nationalId = nationalId;
        this.enabled = enabled;
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

    public Users(Organization organization) {
        this.organization = organization;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }


    public List<Certificates> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificates> certificates) {
        this.certificates = certificates;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public List<Shared> getShareds() {
        return shareds;
    }

    public void setShareds(List<Shared> shareds) {
        this.shareds = shareds;
    }
}
