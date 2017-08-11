package com.usermanagement.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagement.model.User;
import com.usermanagement.repository.UserRepository;
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/rest/{id}", method = RequestMethod.GET)
	@ResponseBody
	public User searchUser(@PathVariable Long id){
		return userRepository.findOne(id);
	}
	
	@RequestMapping(value="/rest", method=RequestMethod.POST)
	public User addUser(@RequestBody User userDtls){
		return userRepository.saveAndFlush(userDtls);
	}
//	@RequestMapping(value="/", method=RequestMethod.POST)
//	public String home(Model model) {
//		return "redirect:UserService.html";
//	}
	
//	@RequestMapping(value="/rest/{userName}/{lastName}", method = RequestMethod.GET)
//	@ResponseBody
//	public User searchUser(@PathVariable String userName,
//		@PathVariable String lastName){
//		return userRepository.findOne((long) 1);
//	}
}
