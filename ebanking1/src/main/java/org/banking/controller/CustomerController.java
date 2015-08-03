package org.banking.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.banking.model.Customer;
import org.banking.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CrudService customerservice;

	final static Logger logger = Logger.getLogger(CustomerController.class);

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public void addCustomer(@RequestBody Customer customer) {

		customerservice.add(customer);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public @ResponseBody List<Customer> getCustomerlist() {
		List<Customer> customer = customerservice.list();
		return customer;
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json", value = "/delete/{id}")
	public void deleteCustomer(@PathVariable("id") int id) {
		customerservice.remove(id);

	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String showMsg() {
		return "CustomerController";
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json", value = "/edit")
	public void editCustomer(Customer customer) {
		customerservice.update(customer);

	}

}
