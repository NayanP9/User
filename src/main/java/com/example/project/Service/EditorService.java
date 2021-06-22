package com.example.project.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.Editor;
import com.example.project.Repository.EditorRepository;


@Service
public class EditorService {
	
	@Autowired
	private EditorRepository editorrepo;
	
	
	 public EditorService() {}
	  
	 public EditorService(EditorRepository editorrepo) 
	 { super(); 
	 this.editorrepo = editorrepo; 
	 }
	 
	
	public Editor saveMyBlog(Editor editor) {
		return editorrepo.save(editor);
	}
	
	public List<Editor> showAllData(){
		List<Editor> editor = new ArrayList<Editor>();
		for(Editor edit : editorrepo.findAll()) {
			editor.add(edit);
		}
		
		return editor;
	}
}
