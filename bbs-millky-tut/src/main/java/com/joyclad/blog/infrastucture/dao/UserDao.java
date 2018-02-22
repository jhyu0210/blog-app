//package com.joyclad.blog.infrastucture.dao;
//
//import java.util.List;
//
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
//import com.joyclad.blog.model.User;
//
//	@RepositoryRestResource(collectionResourceRel = "users", path ="users")
//	public interface UserDao extends MongoRepository<User, String>{
//		List<User> findByUserName(@Param("name") String name);	
//	}
