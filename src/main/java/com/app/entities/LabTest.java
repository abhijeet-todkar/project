package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "lab_test")

public class LabTest extends BaseEntity{
	
	@Column(name = "test_name", length = 20)
	private String testName;
	@Column(nullable = false)
	private double price;
	
}
