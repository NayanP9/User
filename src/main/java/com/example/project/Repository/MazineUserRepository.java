package com.example.project.Repository;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.Mazine;

@Repository
public interface MazineUserRepository extends CrudRepository<Mazine, Integer> {


	public Iterable<Mazine> deleteByMagname(String magname);
	
	
}
