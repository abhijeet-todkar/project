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
@Table(name = "departments")
public class Department extends BaseEntity {
	
	@Column(name = "department_name", length = 20)
	private String deptName;
	
	@Column(name = "description")
	private String deptDesc;
	
}
