package com.elm.tajseer.tajseer.Controller;


import com.elm.tajseer.tajseer.Model.Certificates;
import com.elm.tajseer.tajseer.Model.Users;
import com.elm.tajseer.tajseer.Service.CertificatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/Certificates")
@CrossOrigin(origins = "http://localhost:4200")
public class CertificatesController {

        @Autowired
        private CertificatesService certificatesService;

    @RequestMapping(value = "/UploadCertificate/{certificateId}", method = RequestMethod.POST, consumes = { "multipart/form-data" })
    public Certificates uploadCertificate(
            @RequestParam String description,
            @RequestParam Date date ,
            @PathVariable("certificateId") Users userId,
            @RequestParam("file") MultipartFile file) {
        Certificates certificate = certificatesService.uploadCertificate(description,date,userId,file);
        return certificate;
    }

    @PostMapping(value = "/AddCertificate")
    public Certificates addCertificate(@RequestBody Certificates certificate) {
        return certificatesService.addCertificate(certificate);
    }


        @GetMapping(value = "/GetAllCertificates")
        public List<Certificates> getAllCertificates() {
            return certificatesService.getAllCertificates();
        }

        @GetMapping(value = "/GetCertificate/{certificateId}")
        public Certificates getCertificate(@PathVariable("certificateId") int certificateId) {
            return certificatesService.getCertificates(certificateId);
        }

        @PutMapping(value = "/UpdateCertificate/{certificateId}")
        public Certificates updateCertificate(
                @RequestBody Certificates certificates,
                @PathVariable("certificateId") int certificateId) {
            return certificatesService.updateCertificates(certificates, certificateId);
        }

        @DeleteMapping(value = "DeleteCertificate/{certificateId}")
        public void deleteCertificate(@PathVariable("certificateId") int certificateId) {
            certificatesService.deleteCertificates(certificateId);
        }

    @GetMapping(value = "/GetAllCertificates/{userID}")
    public List<Certificates> getAllCertificatesByUserID(@PathVariable("userID") Integer userID) {
        return certificatesService.getAllCertificatesByUserID(userID);
    }

}
