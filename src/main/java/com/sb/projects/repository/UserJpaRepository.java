package com.sb.projects.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.projects.model.Users;

@Repository
public interface UserJpaRepository extends JpaRepository<Users, Long> {

	public Users findByName(String name);
	

}
