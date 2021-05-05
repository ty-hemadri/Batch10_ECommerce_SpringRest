package com.te.ecommercerest.dao;

import java.util.List;

import com.te.ecommercerest.beans.ItemBean;

public interface AdminDAO {

	

	public ItemBean getEmpData(Integer aid);

	public boolean addItem(ItemBean Bean);

	public boolean updateItem(ItemBean infoBean);

	public boolean deleteItem(Integer id);

	public List<ItemBean> getAllEmployeeDetails();

}
