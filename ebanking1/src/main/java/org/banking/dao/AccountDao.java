package org.banking.dao;

import java.util.List;
import org.banking.model.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class AccountDao implements AccountMark {
	//final static Logger logger = Logger.getLogger(CoustomerDao.class);


	private SessionFactory sessionfactory;

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}


	@Override
	@Transactional
	public void saveOrupdate(Account account) {
		Session session = this.sessionfactory.getCurrentSession();

		session.save(account);

	}

	@Override
	@Transactional
	public List<Account> find() {
		Session session = this.sessionfactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Account> Accounts = session.createQuery("from Account")
				.list();
		return Accounts;
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionfactory.getCurrentSession();
		// TODO Auto-generated method stub
		Account dltAccount = (Account) session.load(Account.class,
				new Integer(id));
		session.delete(dltAccount);
	}

	@Override
	@Transactional
	public void edit(int id,Account account) {
		// Retrieve session from Hibernate
		Session session = this.sessionfactory.getCurrentSession();

		// Retrieve existing person via id
		Account existingaccount = (Account)session.load(Account.class,new Integer(id));
		existingaccount.setAccountType(account.getAccountType());
		existingaccount.setActive(account.getActive());
		existingaccount.setBalance(account.getBalance());
		existingaccount.setCreatedDate(account.getCreatedDate());
		existingaccount.setCreatedUser(account.getCreatedUser());
		session.save(existingaccount);
		// Assign updated values to this person

	}
	

}
