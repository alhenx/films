package com.service.user;

import java.util.List;

import com.dto.user.UserDTO;
import com.model.user.User;

public interface UserService {
	
	UserDTO transform(User u);
	User transform(UserDTO u);
	public List<UserDTO> findAll();
	public UserDTO findUserDTOById(Integer id);
	public UserDTO create(UserDTO u);
	public UserDTO update(UserDTO u, Integer id);
	public void delete(Integer id);

}
