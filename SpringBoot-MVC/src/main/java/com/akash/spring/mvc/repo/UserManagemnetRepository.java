package com.akash.spring.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akash.spring.mvc.entity.User;

@Repository
public interface UserManagemnetRepository extends JpaRepository<User, String>{

	User findByEmailAndPassword(String email, String password);
}
