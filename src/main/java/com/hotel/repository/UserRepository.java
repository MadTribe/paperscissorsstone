package com.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.hotel.entity.User;
import com.hotel.repository.base.BaseRepository;

public interface UserRepository  extends BaseRepository<User, Integer>,UserRepositoryCustom, JpaSpecificationExecutor<User> {

	List<User> findByUserName(String name);

}
