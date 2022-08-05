package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "doctors")
public class Doctor extends UserEntity {
	

	@Column(length = 20)
	private String speciality;
	@Column(length = 20)
	private String education;
	private double fees;
	private String imagepath;

	//dept table's relation
	@ManyToOne(fetch = FetchType.LAZY)  //owning side - Doctor is child of Department
	@JoinColumn(name = "department_id", nullable = false)
	private Department department;
	
	//feedback table's relation
	@Embedded
	@ElementCollection
	@CollectionTable(name = "doctor_feedbacks",joinColumns = @JoinColumn(name="doctor_id"))
	private List<Feedback> feedbacks = new ArrayList<Feedback>();
	
	@Override
	public String toString() {
		return "Doctor [id= " + getId()+ " name= " + getName()+ " password= " + getPassword() + " gender= " + getGender() + " email= " + getEmail() + " speciality=" + speciality + ", education=" + education + ", fees=" + fees + ", imagepath="
				+ imagepath + "]";
	}
	
}