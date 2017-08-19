package com.kwu.springbootmaven.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{ //entity, id
	
	public List<Course> findByTopicId(String topicId); //JPA, auto implementation (findBy)(Topic)(Id) 
}
