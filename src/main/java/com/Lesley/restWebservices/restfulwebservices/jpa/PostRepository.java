package com.Lesley.restWebservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lesley.restWebservices.restfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
