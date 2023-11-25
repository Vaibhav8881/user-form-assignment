package com.user.form.dto;

import com.user.form.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsDTO {
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String location;
	private int age;
	private Gender gender;
}
