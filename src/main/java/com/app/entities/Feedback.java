package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

@Embeddable
public class Feedback {
	
	@Column(nullable = false)
	private String comments;
	
	private double rating;
	
}
