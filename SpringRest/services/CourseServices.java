package com.springrest.SpringRest.services;

import java.util.List;

import com.springrest.SpringRest.entities.Courses;

public interface CourseServices {
	
	public List<Courses> getCourses(); 

	public Courses getCourse(long courseId);

	public Courses addcourse(Courses course);

	public Courses updateCourse(Courses course);

	public void deleteCourse(long courseId);





	

}
