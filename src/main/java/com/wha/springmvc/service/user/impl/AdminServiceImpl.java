package com.wha.springmvc.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.springmvc.dao.user.IAdminDao;
import com.wha.springmvc.model.user.Admin;
import com.wha.springmvc.service.user.IAdminService;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private IAdminDao dao;

	@Override
	public void save(Admin admin) {
		dao.save(admin);
	}

	@Override
	public Admin findOneById(long id) {
		return dao.findOneById(id);
	}

	@Override
	public List<Admin> findAll() {
		return dao.findAll();
	}

	@Override
	public void update(long id, Admin admin) {
		dao.update(id, admin);
	}

	@Override
	public void delete(long id) {
		dao.delete(id);
	}

}