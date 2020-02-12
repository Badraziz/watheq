package com.elm.tajseer.tajseer.Service;


import com.elm.tajseer.tajseer.Model.Certificates;
import com.elm.tajseer.tajseer.Repository.CertificatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificatesServiceImplimentation  implements  CertificatesService {

    @Autowired
    private CertificatesRepository certificatesRepository ;

    @Override
    public String addCertificate(Certificates certificates){
        certificatesRepository.save(certificates);
        return "Certificate added Successfully";
    }
    @Override
    public List<Certificates> getAllCertificates(){
        return certificatesRepository.findAll();
    }
    @Override
    public Certificates getCertificates(int CertificatesId){
        return certificatesRepository.findById(CertificatesId).get();
    }
    @Override
    public Certificates updateCertificates(Certificates certificates, int CertificatesId){
        certificates.setCertificateId(CertificatesId);
        return certificatesRepository.save(certificates);
    }
    @Override
    public void deleteCertificates(int CertificatesId){
        certificatesRepository.deleteById(CertificatesId);
    }

}
