package com.dao.user;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.dto.user.UserDTO;
import com.model.user.User;


@Repository
public interface UserDao extends PagingAndSortingRepository<User,Integer>{
	public List<UserDTO> findByNameContaining(String name);
	public UserDTO findById(Integer id);
}

