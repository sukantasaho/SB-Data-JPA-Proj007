package com.main.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.main.entity.Doctor;
import com.main.view.IDoctorView;
import com.main.view.IView;

 
 
public interface IDoctorRepository extends JpaRepository<Doctor, Integer>
{
  
	  
	 
}
