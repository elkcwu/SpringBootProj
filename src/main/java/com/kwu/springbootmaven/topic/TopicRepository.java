package com.kwu.springbootmaven.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{ //entity, id
	
}
