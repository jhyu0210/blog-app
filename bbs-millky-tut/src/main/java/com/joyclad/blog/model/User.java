package com.joyclad.blog.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
	@Id
	private String id;
	private String userName;
	private String gender;
	private int	age;
	}
