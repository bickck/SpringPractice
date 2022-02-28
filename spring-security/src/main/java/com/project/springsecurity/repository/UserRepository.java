package com.project.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springsecurity.model.User;

// CRUD 함수를 JpaRepository가 들고 있음
// @Repository라는 어노테이션이 없어도 IoC가 된다. 이유는 JpaRepository가 들고 있음
public interface UserRepository extends JpaRepository<User, Integer> {

	// findBy 규칙 -> Username문법
	// select * from user where usernmae= 1?
	public User findByUsername(String username); // JpaQureyMethod;
}
