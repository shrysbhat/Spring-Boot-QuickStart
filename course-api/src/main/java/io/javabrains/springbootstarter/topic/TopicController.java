package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("spring","Spring Framework", "Spring Framework description"),
				new Topic("java","Java Framework", "Core Java Framework description"),
				new Topic("javascript","Javascript Framework", "Javascript Framework description")
				);
	}

}
