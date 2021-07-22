package com.example.project.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.Magazine;

@Repository

public interface MagazineRepository extends JpaRepository<Magazine, Integer> {

	public Iterable<Magazine> deleteByMagid(int magid);

	/*
	 * public Magazine getImage(byte[] coverimage);
	 * 
	 * public Magazine uploadImage(byte[] coverimage);
	 */
}