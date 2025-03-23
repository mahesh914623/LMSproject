package com.project.web.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.web.model.Course;

public interface Courseinfo extends JpaRepository< Course, Integer> {

}
