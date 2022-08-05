package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IDoctorRepository;

@Service
@Transactional
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	IDoctorRepository DoctorRepo;
	
	
}
