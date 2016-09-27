package com.att.owb.service;

import org.springframework.stereotype.Service;

import com.att.owb.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User getIt() {
		User user = new User();
    	user.setId(5);
    	user.setName("Pradyumna");
        return user;
	}

}
