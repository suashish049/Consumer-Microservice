package com.swiggato.consumer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.swiggato.consumer.model.UserProfile;
import com.swiggato.consumer.service.UserProfileService;

@RestController
public class UserProfileController {
	
	@Autowired
	private UserProfileService userProfileService;
	
	@GetMapping("/viewProfile/{id}")
	public Optional<UserProfile> viewProfile(@PathVariable Long id) {
		return userProfileService.fetchUserProfileByID(id);
	}
	
}
