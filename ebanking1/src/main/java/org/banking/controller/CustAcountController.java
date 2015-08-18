package org.banking.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.banking.model.Account;
import org.banking.model.Customer;
import org.banking.service.AccountService;
import org.banking.service.Customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Accountdetails")
public class CustAcountController {
	@Autowired
	private AccountService accountservice;

	@Autowired
	private Customerservice customerservice;
	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public @ResponseBody Map<Class<?>,Object> getdetails(){
		
		Map<Class<?>,Object> details=new HashMap<Class<?>, Object>();
	List<Account> account=accountservice.list();
	List<Customer> customer=customerservice.list();
		details.put(Account.class,account);
details.put(Customer.class, customer);
return details;
	}

}



