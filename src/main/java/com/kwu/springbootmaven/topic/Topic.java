package com.kwu.springbootmaven.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String description;
//	private Author author;
	
	
	public Topic(){
		
	}
	
	public Topic(String id, String name, String description) { //, Author author
		super();
		this.id = id;
		this.name = name;
		this.description = description;
//		this.author = author;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

//	public Author getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(Author author) {
//		this.author = author;
//	}
	

}
