package com.te.ecommercerest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ecommercerest.beans.ItemBean;
import com.te.ecommercerest.dao.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDAO dao;

	public ItemBean getEmpData(Integer aid) {
		// TODO Auto-generated method stub
		return dao.getEmpData(aid);
	}

	public boolean addItem(ItemBean Bean) {
		// TODO Auto-generated method stub
		return dao.addItem(Bean);
	}

	public boolean updateItem(ItemBean infoBean) {
		// TODO Auto-generated method stub
		return dao.updateItem(infoBean);
	}

	@Override
	public boolean deleteItem(Integer id) {
		// TODO Auto-generated method stub
		return dao.deleteItem(id);
	}

	@Override
	public List<ItemBean> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return dao.getAllEmployeeDetails();
	}

}
