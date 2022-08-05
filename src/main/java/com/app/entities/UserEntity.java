package com.app.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class UserEntity extends BaseEntity {
	@Column(length = 30, nullable = false)
	private String name;
	@Column(length = 30, nullable = false)
	private String password;
	@Column(length = 10)
	private String gender;
	@Column(length = 20,unique = true, nullable = false)
	private String email;
}
