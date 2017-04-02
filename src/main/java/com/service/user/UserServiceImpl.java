package com.service.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.user.UserDao;
import com.dto.user.UserDTO;
import com.model.user.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;
	
	@Override
	public UserDTO transform (User u){
		return new UserDTO(u.getName());
	}
	
	@Override
	public User transform (UserDTO u){
		final User user = new User();
		user.setName(u.getName());
		return user;
	}
	
	@Override
	public List<UserDTO> findAll(){
		List<UserDTO> alluser = new ArrayList<UserDTO>();
		userdao.findAll().forEach(u -> alluser.add(transform(u)));
		return alluser;
	}

	@Override
	public UserDTO findUserDTOById(Integer id) {
		final User u = userdao.findOne(id);
		return transform((u!=null)? u : new User());
	}

	@Override
	public UserDTO create(UserDTO u) {
		return transform(userdao.save(transform(u)));
	}

	@Override
	public UserDTO update(UserDTO u, Integer id) {
		final User user = transform(u);
		user.setId(id);
		return transform(userdao.save(user));
	}

	@Override
	public void delete(Integer id) {
		userdao.delete(id);
	}

}
