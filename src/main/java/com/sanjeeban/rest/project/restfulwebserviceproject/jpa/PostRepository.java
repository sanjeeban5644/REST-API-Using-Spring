package com.sanjeeban.rest.project.restfulwebserviceproject.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjeeban.rest.project.restfulwebserviceproject.user.Post;

public interface PostRepository extends JpaRepository<Post,Integer> {
	
}
