package com.springrest.SpringRest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRest.entities.Courses;
import com.springrest.SpringRest.services.CourseServices;

//Represntional state transfer --->

@RestController
public class MyController {
	@Autowired
	private CourseServices courseServices;
	 
	
	
	// Get the Courses
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return this.courseServices.getCourses();
		
	}
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
	 return this.courseServices.getCourse(Long.parseLong(courseId));
		
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		return this.courseServices.addcourse(course);
	}
	
	
	@PutMapping("/courses")
	public Courses updateCourses(@RequestBody Courses course) {
		return this.courseServices.updateCourse(course);
		
	}
	@DeleteMapping("/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		this.courseServices.deleteCourse( Long.parseLong(courseId));
	System.out.println("Course Removed");
	}

}
