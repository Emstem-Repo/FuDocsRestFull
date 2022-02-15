package com.emst.Fudocs.service;

import java.util.List;

import com.emst.Fudocs.model.Role;
import com.emst.Fudocs.model.User;

public interface UserService {

	public User saveUser(User user);

	public Role saveRole(Role role);

	public void addRoleToUser(String username, String roleName);

	public User getUser(String username);
	
	public List<User> getUsers();
}
