package org.banking.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.banking.model.Account;
import org.banking.service.AccountMarker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/Accounts")
public class AccountController {
	@Autowired
	private AccountMarker accountservice;
	final static Logger logger = Logger.getLogger(AccountController.class);

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public void addAccount(@RequestBody Account account ) {

		accountservice.add(account);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public @ResponseBody List<Account> getCustomerlist() {
		List<Account> account = accountservice.list();
		return account;
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json", value = "/delete/{id}")
	public void deleteCustomer(@PathVariable("id") int id) {
		accountservice.remove(id);
	}
	
		@RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json", value = "/edit")
		public void editCustomer(int id,Account account) {
			accountservice.update(id,account);

	}

}
