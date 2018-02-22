package com.joyclad.blog.infrastucture.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joyclad.blog.model.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer> {
		
	}

