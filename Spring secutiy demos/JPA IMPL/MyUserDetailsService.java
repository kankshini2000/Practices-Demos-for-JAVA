package com.springsecurity.SpringsecurityDemos.examples;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import model.MyUserDetails;
import model.UserEntity;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String uname) throws UsernameNotFoundException {
		Optional<UserEntity> userEntity=userRepository.findByUserName(uname);
		
		userEntity.orElseThrow(()->new UsernameNotFoundException("not found: " +uname ));
		return userEntity.map(MyUserDetails::new).get();
		
		//we gotta wrte some logic  which returns the user details instnace for a given user n spring security is 
		//happy with it,its gonna call the service everytime someone 
		//gonna authenticate pass the user id,n gonna trust whatver the services r taught
	}
}
//Explanantion: here the spring securty is gonna call UserDetailsService n say we have a user with this "username="sunita"",
//n give me sunits userdetails,So userdetailservice is gonna return userdetailserviceisntnace i.e newmyuserdetails n gonna pass
//sunita in the Strign username mentioned above, then we r returning an object with ROLE_USER in MyUserDetail class,with pswd aa
//pass which was hardcoded win the class itself.