package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Doctor;

@Repository
public interface IDoctorRepository extends JpaRepository<Doctor, Long> {

}
