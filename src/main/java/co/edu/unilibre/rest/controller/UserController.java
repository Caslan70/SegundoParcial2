package co.edu.unilibre.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.rest.UserDto.UserDto;

@RestController
public class UserController {


	@RequestMapping(value= "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserDto> allUser(){
		List<UserDto> User = new ArrayList<>();
			
		UserDto User1 = new UserDto(1, "richard.feynman", 2);
		UserDto User2 = new UserDto(2, "carl.sagan", 2);
		UserDto User3 = new UserDto(3, "marie.curie", 1);
		UserDto User4 = new UserDto(4, "johannes.kepler", 3);
		
		User.add(User1);
		User.add(User2);
		User.add(User3);
		User.add(User4);
		
		return User;
	}
	
}
