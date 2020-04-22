package com.tseringkalden.authentication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tseringkalden.authentication.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	User findByEmail(String Email);

}
