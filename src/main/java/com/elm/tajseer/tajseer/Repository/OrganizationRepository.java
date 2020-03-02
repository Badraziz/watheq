package com.elm.tajseer.tajseer.Repository;

import com.elm.tajseer.tajseer.Model.Organization;
import com.elm.tajseer.tajseer.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization,String> {
    Organization findByOrganizationId(String organizationName);
}
