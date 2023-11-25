package com.user.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.form.entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Long>{

}
