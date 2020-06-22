package com.elm.tajseer.tajseer.Repository;

import com.elm.tajseer.tajseer.Model.Certificates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@EnableJpaRepositories
public interface CertificatesRepository extends JpaRepository <Certificates, Integer> {

    @Query(value = "SELECT * FROM    [springbootdb].[dbo].[certificates]  WHERE [user_id] = ?1 \n", nativeQuery = true)
    List<Certificates> findCertificatesByUserID(Integer userID);

    @Query(value = "SELECT * FROM CERTIFICATES c WHERE c.CERTIFICATEID = ?1 AND c.USERID = ?2", nativeQuery = true)
    Certificates findCertificateByUserID(int certificateID, int userID);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Certificates c set c.CERTIFICATE_DESCRIPTION = :CERTIFICATE_DESCRIPTION, c.CERTIFICATE_DATE = :CERTIFICATE_DATE, c.USERID = :userID where c.CERTIFICATEID = :certificateID", nativeQuery = true)
    void updateFile(String CERTIFICATE_DESCRIPTION, String CERTIFICATE_DATE, Integer userID, Integer certificateID);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM [springbootdb].[dbo].[certificates]  WHERE [certificate_id] = ?", nativeQuery = true)
    void deleteCertificateByCertificateID(Integer CertificatesId);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Certificates c set c.CERTIFICATE_DESCRIPTION = :CERTIFICATE_DESCRIPTION, c.CERTIFICATE_DATE = :CERTIFICATE_DATE, c.CERTIFICATE_NAME = :CERTIFICATE_NAME where c.CERTIFICATEID = :certificateID", nativeQuery = true)
    void updateCertificate(String CERTIFICATE_DESCRIPTION, String CERTIFICATE_DATE, String CERTIFICATE_NAME, Integer certificateID);
}
