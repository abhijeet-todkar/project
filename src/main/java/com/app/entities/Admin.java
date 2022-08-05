package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "admins")
public class Admin extends UserEntity {

	@Override
	public String toString() {
		return "Admin [id= " + getId()+ " name= " + getName()+ " password= " + getPassword() + " gender= " + getGender() + " email= " + getEmail() + "]";
	}
}