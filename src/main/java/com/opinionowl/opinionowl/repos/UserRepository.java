package com.opinionowl.opinionowl.repos;

import com.opinionowl.opinionowl.models.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * The repository in charge of managing the CRUD operations for the User Entity.
 */
public interface UserRepository extends CrudRepository<AppUser, Long>{
    List<AppUser> findAll();

    AppUser findById(long id);
}
