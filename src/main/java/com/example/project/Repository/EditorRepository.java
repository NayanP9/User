package com.example.project.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.Editor;
import com.example.project.Model.User;

@Repository
public interface EditorRepository extends CrudRepository<Editor,Integer> {

	

	

}
