package com.rocket.delivery.rocket.delivery.service.impl;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.rocket.delivery.rocket.delivery.dto.UserDto;
import com.rocket.delivery.rocket.delivery.repository.UserRepository;
import com.rocket.delivery.rocket.delivery.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	ModelMapper modelMapper = new ModelMapper();

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<UserDto> getAllUsers() {
		return Arrays.asList(modelMapper.map(userRepository.findAll(), UserDto[].class));
	}

}
