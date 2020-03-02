package com.elm.tajseer.tajseer.Model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int organizationId ;
    @Column
    private String organizationName ;
    @Column
    private  String organizationAddress ;
    @Column
    private String organizationContact ;
    @Column
    private  String email ;

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<Certificates> certificates = new ArrayList<>();

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<Users> users = new ArrayList<>();

        public Organization() {
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    public String getOrganizationContact() {
        return organizationContact;
    }

    public void setOrganizationContact() {
        this.organizationContact = organizationContact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
