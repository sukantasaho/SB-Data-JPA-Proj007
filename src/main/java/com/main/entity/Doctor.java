package com.main.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Jpa_Doctor_Info")
@Data
public class Doctor 
{
	 @Id
	 @GeneratedValue
	 @Column(name="DOC_ID")
     private Integer docId;
	 
	 @Column(name="DOC_NAME")
     private String docName;
	 
	 @Column(name="INCOME")
     private Float income;
	 
	 @Column(name="SPECIALIZATION")
     private String specialization;
     
     
}
