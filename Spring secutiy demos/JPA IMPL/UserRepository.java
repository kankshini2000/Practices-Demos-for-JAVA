package com.springsecurity.SpringsecurityDemos.examples;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	//creating  defination of a method
	//here we r tellign jpa we need a method which finds by username
	//which takes apeing as an argument
	Optional<UserEntity> findByUserName(String uname);
//tells spring jpa the particular service  has to be have an imple,tnaiton whihc needs to work on usr entity
//n the method provides the hint abt what this needs to fo


}
