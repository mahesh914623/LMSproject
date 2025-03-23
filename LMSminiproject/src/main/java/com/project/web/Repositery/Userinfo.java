package com.project.web.Repositery;



import org.springframework.data.jpa.repository.JpaRepository;
import com.project.web.model.User;
import java.util.List;

public interface Userinfo extends JpaRepository<User,Integer>{
	public User findByEmailId(String emailId);
	public User findById(int id);
	
}
