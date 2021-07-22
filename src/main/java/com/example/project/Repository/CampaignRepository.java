package com.example.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.project.Model.Blogs;
import com.example.project.Model.Campaign;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Integer>{

	@Query(value="SELECT * FROM offertable WHERE status='active'", nativeQuery=true)
	public List<Campaign> getCamp();
	
	public Iterable<Campaign> deleteByFestivalid(int festivalid);
}