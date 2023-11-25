package com.user.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

	@GetMapping(value="/success")
	public String submitFormViaForm(UserDetailsDTO userDetailDTO) {
		userService.saveUserForm(userDetailDTO);
		return "success";
	}
	
	@PostMapping(value="/submitForm")
	public ResponseEntity<String> submitForm(@RequestBody UserDetailsDTO userDetailDTO) {
		return new ResponseEntity<>(userService.saveUserForm(userDetailDTO), HttpStatus.OK);
	}
}
