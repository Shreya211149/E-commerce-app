package com.genie.Ecommerce.repo;

import com.genie.Ecommerce.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByEmail(String email);
}
