package com.elm.tajseer.tajseer.Service;

import com.elm.tajseer.tajseer.Model.Certificates;


import java.util.List;

public interface CertificatesService {


    public String addCertificate(Certificates certificates);
    public List<Certificates> getAllCertificates();
    public Certificates getCertificates(int CertificatesId);
    public Certificates updateCertificates(Certificates certificates, int CertificatesId);
    public void deleteCertificates(int CertificatesId);
}
