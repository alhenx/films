package com.dbg.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.dto.user.UserDTO;
import com.dbg.service.user.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserDTO findById(@PathVariable("id") Integer id){
		return userservice.findUserDTOById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<UserDTO> findAll(){
		return userservice.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public UserDTO create(@RequestBody UserDTO u){
		return userservice.create(u);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public UserDTO update(@PathVariable("id") Integer id, @RequestBody UserDTO u){
		return userservice.update(u, id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id){
		userservice.delete(id);
	}
}
