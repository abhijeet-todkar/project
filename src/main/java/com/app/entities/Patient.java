package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "patients")
public class Patient extends UserEntity {
	
	@Column(length = 100)
	private String address;
	
	@Enumerated(EnumType.STRING)
	private BloodGroup bloodGroup;
	@Column(nullable = false)
	private int age;
	@Column(nullable = false)
	private double weight;
	@Column(nullable = false)
	private double height;
	//private boolean status;
	
	@Override
	public String toString() {
		return "Patient [id= " + getId()+ " name= " + getName()+ " password= " + getPassword() + " gender= " + getGender() + " email= " + getEmail() +" address=" + address + ", bloodGroup=" + bloodGroup + ", age=" + age + ", weight=" + weight
				+ ", height=" + height + "]";
	}
}
