package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.Campaign;


@Repository
public interface CampaignsRepository extends JpaRepository<Campaign, Integer>{
	public Iterable<Campaign> deleteByFestname(String festname);
}
