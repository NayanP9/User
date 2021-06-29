package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.CardUser;

@Repository
public interface CardUserRepository extends JpaRepository<CardUser, Integer>{

}
