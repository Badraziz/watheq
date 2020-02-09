package com.elm.tajseer.tajseer.Repository;


import com.elm.tajseer.tajseer.Model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<Users,Integer> {

    List<Users> findAll();
}
