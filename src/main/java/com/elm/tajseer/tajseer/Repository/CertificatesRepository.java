package com.elm.tajseer.tajseer.Repository;

import com.elm.tajseer.tajseer.Model.Certificates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface CertificatesRepository extends JpaRepository <Certificates, Integer> {

}
