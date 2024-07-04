package com.swiggato.consumer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggato.consumer.model.UserProfile;
import com.swiggato.consumer.repository.UserProfileRepository;

@Service
public class UserProfileService {
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	public Optional<UserProfile> fetchUserProfileByID(Long id) {
		return userProfileRepository.findById(id);
	}
}
