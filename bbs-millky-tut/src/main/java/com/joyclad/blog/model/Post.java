package com.joyclad.blog.model;

import java.time.LocalDateTime;
//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post {
	@Id
	@GeneratedValue
	int id;
	
	@NotNull
	@Size(min = 1, max = 255)
	@Column(nullable = false)
	String title;
	
	@Size(max = 255)
	String subtitle;
	
	@NotNull
	@Size(min =1 , max = 10000000)
	@Column(length=10000000, nullable = false )
	String content;
	
	LocalDateTime regDate;
	String userId;
	String name;
	String _csrf;
	
}