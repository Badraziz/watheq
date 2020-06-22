package com.elm.tajseer.tajseer.Service;

import com.elm.tajseer.tajseer.Model.Certificates;
import com.elm.tajseer.tajseer.Model.Users;
import org.springframework.web.multipart.MultipartFile;


import java.util.Date;
import java.util.List;

public interface CertificatesService {


    public Certificates addCertificate(Certificates certificate);
    public List<Certificates> getAllCertificates();
    public Certificates getCertificates(int CertificatesId);
    public Certificates updateCertificates(Certificates certificates, int CertificatesId);
    public void deleteCertificates(int CertificatesId);
    public  Certificates uploadCertificate(String description, Date date, Users userId, MultipartFile file);
    public List<Certificates> getAllCertificatesByUserID(Integer userID);
}
