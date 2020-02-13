package com.elm.tajseer.tajseer.Service;


import com.elm.tajseer.tajseer.Model.Certificates;
import com.elm.tajseer.tajseer.Repository.CertificatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CertificatesServiceImplimentation  implements  CertificatesService {

    @Autowired
    private CertificatesRepository certificatesRepository ;


     @Override
     public Certificates uploadCertificate(MultipartFile file) {
         String fileName = StringUtils.cleanPath(file.getOriginalFilename());
         try {
             if(fileName.contains(".."))
                 throw new Exception();

             Certificates certificate = new Certificates(fileName, file.getContentType(), file.getBytes());
             return certificatesRepository.save(certificate);
         }
         catch(IOException e) {
             return null;
         }
         catch(Exception e) {
             return null;
         }
     }

    @Override
    public Certificates addCertificate(Certificates certificates) {
        return certificatesRepository.save(certificates);
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