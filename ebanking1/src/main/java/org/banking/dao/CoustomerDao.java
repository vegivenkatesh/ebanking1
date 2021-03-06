package org.banking.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.banking.model.Customer;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CoustomerDao implements CustomerMark {
	final static Logger logger = Logger.getLogger(CoustomerDao.class);

	private SessionFactory sessionfactory;
public void setSessionfactory(SessionFactory sessionfactory) {
	this.sessionfactory = sessionfactory;
}


	@Override
	@Transactional
	public void saveOrupdate(Customer customer) {
		Session session = this.sessionfactory.getCurrentSession();

		session.persist(customer);

	}

	@Override
	@Transactional
	public List<Customer> find() {
		Session session = this.sessionfactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Customer> customerlist = session.createCriteria(Customer.class)
				.list();
		//List<Account> accountlist=session.createQuery("from Account");
		//Hibernate.initialize(customerlist.getAccount);
		return customerlist;
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionfactory.getCurrentSession();
		// TODO Auto-generated method stub
		Customer dltcustomer = (Customer) session.load(Customer.class,
				new Integer(id));
		session.delete(dltcustomer);
	}

	@Override
	@Transactional
	public void edit(int id,Customer customer) {
		// Retrieve session from Hibernate
		Session session = this.sessionfactory.getCurrentSession();

		Customer existingcustomer = (Customer) session.get(Customer.class,
				new Integer(id));
		existingcustomer.setAddress(customer.getAddress());
		existingcustomer.setCity(customer.getCity());
		existingcustomer.setCountry(customer.getCountry());
		//existingcustomer.setCustomerId(customer.getCustomerId());
		existingcustomer.setName(customer.getName());
		existingcustomer.setPhone(customer.getPhone());
		session.save(existingcustomer);
		// Assign updated values to this person

	}
	
		
	
}


