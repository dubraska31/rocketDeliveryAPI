package com.rocket.delivery.rocket.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocket.delivery.rocket.delivery.entity.User;
//conexiones que hacemos a la base de de datos 
public interface UserRepository extends JpaRepository<User, Long> {

}
