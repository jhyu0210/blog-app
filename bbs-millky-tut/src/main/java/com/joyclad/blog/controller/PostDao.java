package com.joyclad.blog.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joyclad.blog.model.Post;

public interface PostDao extends JpaRepository<Post, Integer>{
	
}

//package com.joyclad.blog.controller;
////import java.util.List;
//
//import java.util.List;
//
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.query.Param;
////import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
//import com.joyclad.blog.model.Post;
//
//@RepositoryRestResource
//
//public interface PostDao extends MongoRepository<Post, Integer> {
//	List<Post> findBySubject (@Param("subject") String subject);
//}
