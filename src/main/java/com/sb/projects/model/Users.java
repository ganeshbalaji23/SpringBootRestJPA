package com.sb.projects.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Users {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String dept;
	private String salary;

}
