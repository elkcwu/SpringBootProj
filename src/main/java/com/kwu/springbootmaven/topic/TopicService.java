package com.kwu.springbootmaven.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("Spring", "Spring Framework", "SpringFramework Description", new Author("Kevin", "Wu")),
//			new Topic("Java", "Core Java", "Core Java Description", new Author("Landon", "Wu")),
//			new Topic("Javascript", "JavaScript", "Javascript Description", new Author("Sally", "Banh"))
//		));
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<Topic>();
	
//	public TopicService(){
//		topics.add(new Topic("Spring", "Spring Framework", "SpringFramework Description", new Author("Kevin", "Wu")));
//		topics.add(new Topic("Java", "Core Java", "Core Java Description", new Author("Landon", "Wu")));
//		topics.add(new Topic("Javascript", "JavaScript", "Javascript Description", new Author("Sally", "Banh")));
//	}
	
	
	public List<Topic> getAllTopics(){
//		return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id){
//		return topics.stream().filter(kevin -> kevin.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
//		return topics.add(topic);
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
//		for(int i=0; i< topics.size(); i++){
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)){
//				topics.set(i, topic);
//				return;	
//			}					
//		}
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
//		topics.removeIf(kevin -> kevin.getId().equals(id));
		topicRepository.delete(id);
	}
	
}
