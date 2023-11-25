package com.user.form.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.form.dto.UserDetailsDTO;
import com.user.form.entity.UserDetails;
import com.user.form.repository.UserRepository;
import com.user.form.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUserForm(UserDetailsDTO userDetailDTO) {
		UserDetails userDetails = new UserDetails();
		BeanUtils.copyProperties(userDetailDTO, userDetails);
		userRepository.save(userDetails);
	}

}
