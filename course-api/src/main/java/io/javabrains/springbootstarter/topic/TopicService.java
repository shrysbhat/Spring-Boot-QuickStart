package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
				new Topic("spring","Spring Framework", "Spring Framework description"),
				new Topic("java","Java Framework", "Core Java Framework description"),
				new Topic("javascript","Javascript Framework", "Javascript Framework description")
				);
	
	public List<Topic> getAllTopics(){
		return topics;
	}

}
