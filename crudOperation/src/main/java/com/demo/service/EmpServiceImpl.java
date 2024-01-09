package com.demo.service;

import java.util.List;

import com.demo.Dao.EmpDao;
import com.demo.model.Employee;

public class EmpServiceImpl implements EmpService{

	public static EmpDao edao;
	@Override
	public List<Employee> getall() {
		return edao.showAll();
	}

}
