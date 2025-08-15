package com.aj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aj.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	

}
