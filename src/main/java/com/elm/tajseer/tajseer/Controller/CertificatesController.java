package com.elm.tajseer.tajseer.Controller;


import com.elm.tajseer.tajseer.Model.Certificates;
import com.elm.tajseer.tajseer.Service.CertificatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping(value = "/Certificates")
public class CertificatesController {

        @Autowired
        private CertificatesService certificatesService;



    @PostMapping("/UploadCertificate")
    public Certificates uploadCertificate(@RequestParam("file") MultipartFile file) {
        Certificates certificate = certificatesService.uploadCertificate(file);
        return certificate;
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

        public Certificates updateCertificate(@RequestBody Certificates certificates, @PathVariable("certificateId") int certificateId) {

            return certificatesService.updateCertificates(certificates, certificateId);

        }



        @DeleteMapping(value = "DeleteCertificate/{certificateId}")

        public void deleteCertificate(@PathVariable("certificateId") int certificateId) {

            certificatesService.deleteCertificates(certificateId);

        }
}
