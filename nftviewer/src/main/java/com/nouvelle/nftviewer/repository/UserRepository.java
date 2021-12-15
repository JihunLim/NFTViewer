package com.nouvelle.nftviewer.repository;

import java.util.List;

import com.nouvelle.nftviewer.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    //public List<User> findByName(String name);
	//public List<User> findByPhone(String phone);
	//like검색도 가능
	//public List<User> findByNameLike(String keyword);
    
}
