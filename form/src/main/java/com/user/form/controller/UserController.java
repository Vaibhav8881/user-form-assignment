package com.user.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.user.form.dto.UserDetailsDTO;
import com.user.form.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("userForm")
	public String userForm() {
		return "userForm";
	}

	@GetMapping("success")
	public String submitForm(UserDetailsDTO userDetailDTO) {
		userService.saveUserForm(userDetailDTO);
		return "success";
	}
}
