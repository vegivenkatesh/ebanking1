package org.banking.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.banking.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CoustomerDao implements CrudInterface {
	final static Logger logger = Logger.getLogger(CoustomerDao.class);

	@Autowired
	private SessionFactory sessionfactory;

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
		List<Customer> customerlist = session.createQuery("from customer")
				.list();
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
	public void edit(Customer customer) {
		// Retrieve session from Hibernate
		Session session = this.sessionfactory.getCurrentSession();

		// Retrieve existing person via id
		Customer existingcustomer = (Customer) session.get(Customer.class,
				customer.getcustomerId());
		existingcustomer.setName(customer.getName());
		existingcustomer.setAddress(customer.getAddress());
		existingcustomer.setCity(customer.getCity());
		existingcustomer.setCountry(customer.getCountry());
		existingcustomer.setPhone(customer.getPhone());
		session.save(existingcustomer);
		// Assign updated values to this person

	}

}
