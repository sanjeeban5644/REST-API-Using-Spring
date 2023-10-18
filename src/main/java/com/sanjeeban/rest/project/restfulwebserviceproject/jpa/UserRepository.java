package com.sanjeeban.rest.project.restfulwebserviceproject.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjeeban.rest.project.restfulwebserviceproject.user.User;

public interface UserRepository  extends JpaRepository<User,Integer>{
	
}
