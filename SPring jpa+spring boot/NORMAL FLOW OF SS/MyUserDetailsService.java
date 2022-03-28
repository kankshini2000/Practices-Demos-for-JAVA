package com.springsecurity.SpringsecurityDemos.examples;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//we gotta wrte some logic  which returns the user details instnace for a given user name
		//n spring security is happy with it,its gonna call the service everytime someone 
		//gonna authenticate pass the user id,n gonna trust whatver the services r taught
		return new MyUserDetails(username);
	}
}
//Explanantion: here the spring securty is gonna call UserDetailsService n say we have a user with this "username="sunita"",
//n give me sunits userdetails,So userdetailservice is gonna return userdetailserviceisntnace i.e newmyuserdetails n gonna pass
//sunita in the Strign username mentioned above, then we r returning an object with ROLE_USER in MyUserDetail class,with pswd aa
//pass which was hardcoded win the class itself.