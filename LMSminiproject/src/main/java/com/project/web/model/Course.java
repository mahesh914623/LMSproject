package com.project.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	 @Id
	    private int id;

	 
	    private String courseTitle;

	 
	    private String courseTeacher;

	  
	    private String courseDescription;

	   
	    private String courseMaterial;

    // Constructors, getters, and setters
    public Course() {}

    public Course(int id, String courseTitle, String courseTeacher, String courseDescription, String courseMaterial) {
        this.id = id;
        this.courseTitle = courseTitle;
        this.courseTeacher = courseTeacher;
        this.courseDescription = courseDescription;
        this.courseMaterial = courseMaterial;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseMaterial() {
        return courseMaterial;
    }

    public void setCourseMaterial(String courseMaterial) {
        this.courseMaterial = courseMaterial;
    }
}

