package com.elm.tajseer.tajseer.Model;

import  java.sql.Blob ;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Certificates {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int certificateId ;
    @Column
    private String certificateName ;
    private  enum  CertificateType{} ;
    @Column
    private  String certificateDescription  ;
    @Column
    private Date certificateData ;
    private  enum  CertificateStaues{} ;
    @Lob
    private  byte[]  certificateDocument ;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private Users users;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "organizationId")
    private Organization organization;



    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "certificates_shareds",
            joinColumns = {@JoinColumn(name = "CertificateID")},
            inverseJoinColumns = {@JoinColumn(name = "SharedID")}
            )
    private Set<Shared> shareds = new HashSet<Shared>();


    public Certificates(){
    }

    public Certificates(String certificateName, String certificateDescription, byte[] certificateDocument) {
        this.certificateName = certificateName;
        this.certificateDescription = certificateDescription;
        this.certificateDocument = certificateDocument;
    }

    public int getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateDescription() {
        return certificateDescription;
    }

    public void setCertificateDescription(String certificateDescription) {
        this.certificateDescription = certificateDescription;
    }

    public Date getCertificateData() {
        return certificateData;
    }

    public void setCertificateData(Date certificateData) {
        this.certificateData = certificateData;
    }

    public byte[] getCertificateDocument() {
        return certificateDocument;
    }

    public void setCertificateDocument(byte[] certificateDocument) {
        this.certificateDocument = certificateDocument;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Set<Shared> getShareds() {
        return shareds;
    }

    public void setShareds(Set<Shared> shareds) {
        this.shareds = shareds;
    }
}