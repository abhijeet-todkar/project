package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IPatientRepository;

@Service
@Transactional
public class PatientServiceImpl implements IPatientService {

	@Autowired
	IPatientRepository PatientRepo;
}
