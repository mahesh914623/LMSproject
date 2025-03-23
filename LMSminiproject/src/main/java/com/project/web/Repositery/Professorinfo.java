package com.project.web.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.project.web.model.Professor;
import com.project.web.model.User;
import java.util.List;


public interface Professorinfo extends JpaRepository<Professor,Integer>{
   public Professor findByEmailId(String emailId);
   public Professor findById(int id);
   
}
