package org.banking.service;

import java.util.List;

import org.banking.dao.CoustomerDao;
import org.banking.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Customerservice {
	@Autowired
	 CoustomerDao coustomerDao;

	
	public void add(Customer customer) {
		this.coustomerDao.saveOrupdate(customer);
	}

	public void update(Customer customer) {
		this.coustomerDao.edit(customer);

	}

	
	public List<Customer> list() {
		return this.coustomerDao.find();

	}

	public Customer getById(int b) {
		return null;
	}

	
	public void remove(int b) {
		this.coustomerDao.delete(b);
	}


}
