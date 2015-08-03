package org.banking.dao;

import java.util.List;

import org.banking.model.Customer;

public interface CrudInterface {
	public void saveOrupdate(Customer customer);
	public List<Customer> find();
	public void delete(int id);
	public void edit(Customer customer);

}
