package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.main.entity.Doctor;
import com.main.services.IDoctorService;

@SpringBootApplication
public class SbDataJpaProj03Application
{

	public static void main(String[] args) 
	{
		   ApplicationContext ctx = SpringApplication.run(SbDataJpaProj03Application.class, args);
		   IDoctorService service = ctx.getBean("docService", IDoctorService.class);
		   
		   Doctor d = new Doctor();
		   d.setDocName("Rajendra");
		   d.setIncome(54000f);
		   d.setSpecialization("Homeopathy");
		   System.out.println(service.registerDoctor(d));
		      
		    
		      ((ConfigurableApplicationContext) ctx).close();
	}

}
