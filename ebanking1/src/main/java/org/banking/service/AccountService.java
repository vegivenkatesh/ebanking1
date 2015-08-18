package org.banking.service;

import java.util.List;

import org.banking.dao.AccountDao;
import org.banking.dao.AccountMark;
import org.banking.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AccountService implements AccountMarker{
	@Autowired
	private AccountMark accountDao;

	public void add(Account account) {
		this.accountDao.saveOrupdate(account);
	}

	public void update(int id,Account account) {
		this.accountDao.edit(id,account);

	}

	public List<Account> list() {
		return this.accountDao.find();

	}

	public Account getById(int b) {
		return null;
	}

	public void remove(int b) {
		this.accountDao.delete(b);
	}

}
