package org.banking.service;

import java.util.List;

import org.banking.model.Customer;

public interface CrudService {
	public void add(Customer customer);
	public void update(Customer customer);
	public List<Customer> list();
	public Customer getById(int b);
	public void remove(int b); 

}
