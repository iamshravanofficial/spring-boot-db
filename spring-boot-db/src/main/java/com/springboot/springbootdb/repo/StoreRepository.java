package com.springboot.springbootdb.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.springbootdb.entity.StoreInfo;

public interface StoreRepository extends CrudRepository<StoreInfo, Integer>{
	
	List<StoreInfo> findBystorename(String name);
	List<StoreInfo> findBystorePhoneNumber(String PhoneNumber);
	
}
