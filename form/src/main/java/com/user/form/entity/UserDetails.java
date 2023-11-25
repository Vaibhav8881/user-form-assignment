package com.user.form.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.user.form.enums.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "user_details")
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id", nullable = false)
	private Long id;
	
	@Column(name="firstName", nullable = false)
	private String firstName;
	
	@Column(name="middle_name", nullable = true)
	private String middleName;
	
	@Column(name="last_name", nullable = false)
	private String lastName;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="location", nullable = false)
	private String location;
	
	@Column(name="age", nullable = false)
	private int age;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender", nullable = false)
	private Gender gender;
	
	@CreationTimestamp
	@Column(name = "creation_time", nullable=false)
	private Timestamp creationTime;
	
	@UpdateTimestamp
	@Column(name = "update_time", nullable=false)
	private Timestamp updateTime;
}
