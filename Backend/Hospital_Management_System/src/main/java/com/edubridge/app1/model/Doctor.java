package com.edubridge.app1.model;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "doctor_details") 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
	@Id
	@GeneratedValue
	private Integer doctorId;
	
	
	
	private String doctorName,doctorSchedule,emailId,password;
	private Long doctorMobile;
	
	
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
	@JoinColumn(name = "deptId" )
	private DoctorDepartment department;
	
	
	
	//@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	//@JsonIgnore
	//@OneToMany(mappedBy = "doctor")
	//private List<Appointments> appointment;
	
	

	
	

}
