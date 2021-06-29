package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.BilingUser;

@Repository
public interface BilingUserRepository extends JpaRepository<BilingUser, Integer>{
	

}
