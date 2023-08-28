package com.learningspringboot.learningspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* This is serving as a REST API
 * > should return course: id, name, and author
 */

@RestController
public class CourseController {
	
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(			
				new Course(1, "Learn AWS", "in 5 mins"),
				new Course(1, "Learn Azure", "in 5 mins")
				);
	}

}
