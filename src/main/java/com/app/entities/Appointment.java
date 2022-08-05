package com.app.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.AssertFalse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "appointments")
public class Appointment extends BaseEntity {

	private LocalDate date;
	private LocalTime time; //LocalTime.minusMinutes(long minutesToSubtract) //Duration //TimeStamp - sql
	private boolean online;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id", nullable = false)
	private Patient patient;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doctor_id", nullable = false)
	private Doctor doctor;
	
	
	@Override
	public String toString() {
		return "Appointment [id= " + getId() + " date=" + date + ", time=" + time + ", online=" + online + "]";
	}
}
