package com.spring.validation.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.validation.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}