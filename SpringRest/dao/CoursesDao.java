package com.springrest.SpringRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springrest.SpringRest.entities.Courses;

@EnableJpaRepositories
public interface CoursesDao extends JpaRepository<Courses,Long> {

}
