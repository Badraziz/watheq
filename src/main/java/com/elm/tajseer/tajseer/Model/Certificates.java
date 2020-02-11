package com.elm.tajseer.tajseer.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Certificates {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int CertificateId ;
    @Column
    private String CertificateName ;
    @Column
    private  Boolean CertificateType ;
    @Column
    private  String CertificateDescription  ;
    @Column
    private Date CertificateData ;
    @Column
    private  String CertificateStaues ;
    @Column
    private  String CertificateDocument ;


    @ManyToOne
    @JoinColumn(name = "userId")
    private  Users users ;



    public Certificates(){

    }

    public int getCertificateId() {
        return CertificateId;
    }

    public void setCertificateId(int certificateId) {
        CertificateId = certificateId;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public Boolean getCertificateType() {
        return CertificateType;
    }

    public void setCertificateType(Boolean certificateType) {
        CertificateType = certificateType;
    }

    public String getCertificateDescription() {
        return CertificateDescription;
    }

    public void setCertificateDescription(String certificateDescription) {
        CertificateDescription = certificateDescription;
    }

    public Date getCertificateData() {
        return CertificateData;
    }

    public void setCertificateData(Date certificateData) {
        CertificateData = certificateData;
    }

    public String getCertificateStaues() {
        return CertificateStaues;
    }

    public void setCertificateStaues(String certificateStaues) {
        CertificateStaues = certificateStaues;
    }

    public String getCertificateDocument() {
        return CertificateDocument;
    }

    public void setCertificateDocument(String certificateDocument) {
        CertificateDocument = certificateDocument;
    }
}