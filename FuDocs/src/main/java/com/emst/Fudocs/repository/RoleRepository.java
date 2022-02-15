package com.emst.Fudocs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emst.Fudocs.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	public Role findByName(String name);
}
