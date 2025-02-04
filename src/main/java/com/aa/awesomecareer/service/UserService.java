package com.aa.awesomecareer.service;

import java.util.List;

import com.aa.awesomecareer.entity.User;
import com.aa.awesomecareer.model.UserModel;

public interface UserService {
	public List<UserModel> findAll();
	public UserModel findByEmail(String email);
	UserModel addUser(UserModel userModel);

}
