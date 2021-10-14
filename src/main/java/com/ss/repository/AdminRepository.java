package com.ss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ss.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,String>{
	
	@Query(value="SELECT a.username FROM Admin a")
	public List<String> findUsenames();
}
