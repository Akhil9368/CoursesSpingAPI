package com.springrest.SpringRest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.springrest.SpringRest.dao.CoursesDao;
import com.springrest.SpringRest.entities.Courses;
@Service
public class CourseServicesImpl implements CourseServices {
	
//	List<Courses> list;
	@Autowired
	private CoursesDao courseDao;
	
	public CourseServicesImpl() {
//		list = new ArrayList<>();
//		list.add(new Courses(145,"Java Baisc", " This course is for begginers who wants to start the carrier in java with full stack"));
//		list.add(new Courses(122,"Rest Api", "This course is for Rest Api "));
	}
	
	
    @Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

//	@SuppressWarnings("deprecation")
	@Override
	public Courses getCourse( long courseId) {
		// TODO Auto-generated method stub
//		Courses c = null;
//		for(Courses course : list ) {
//			if(course.getId() == courseId) {
//				c= course;
//				break;
//			}
//		}
		return courseDao.findById(courseId).orElse(null);
	}

	@Override
	public Courses addcourse(Courses course) {
		// TODO Auto-generated method stub
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
		// TODO Auto-generated method stub
//	     for(Courses c  : list) {
//	    	
//	    	 if(c.getId() ==  course.getId()) {
//	    		 c.setTittle(course.getTittle());
//	    		 c.setDescription(course.getDescription());
//	    	 }
//	     }
		Courses c = courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
	    // Find the course by ID
	    Courses entity = courseDao.findById(courseId).orElse(null);
	    
	    // Check if the entity exists
	    if (entity != null) {
	        courseDao.delete(entity);
	        System.out.println("Course with ID " + courseId + " deleted successfully.");
	    } else {
	        System.out.println("Course with ID " + courseId + " not found.");
	    }
	}


}
