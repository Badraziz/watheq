package com.elm.tajseer.tajseer.Model;

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

    public void setOrganizationContact(String organizationContact) {
        this.organizationContact = organizationContact;
    }

    private String organizationContact ;
}
