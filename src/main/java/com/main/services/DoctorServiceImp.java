package com.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.entity.Doctor;
import com.main.repository.IDoctorRepository;
import com.main.view.IDoctorView;
import com.main.view.IView;

@Service("docService")
public class DoctorServiceImp implements IDoctorService 
{
	@Autowired
	private IDoctorRepository repo;

	@Override
	public String registerDoctor(Doctor doctor) 
	{
		 
		  return  repo.save(doctor).getDocId()+" reocrd is inserted";
	}

	 
	 
	 
}
