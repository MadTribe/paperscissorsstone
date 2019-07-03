package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.hotel.entity.PSS;
import com.hotel.entity.User;
import com.hotel.repository.base.BaseRepository;

public interface PSSRepository extends BaseRepository<PSS, Integer>,PSSRepositoryCustom, JpaSpecificationExecutor<PSS> {

}
