package com.Lesley.restWebservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lesley.restWebservices.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	

}
