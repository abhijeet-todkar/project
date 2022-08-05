package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IAdminRepository;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {

	@Autowired
	IAdminRepository AdminRepo;
}
