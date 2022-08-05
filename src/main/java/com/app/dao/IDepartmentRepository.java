package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Admin;
import com.app.entities.Department;


@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Long> {

}
