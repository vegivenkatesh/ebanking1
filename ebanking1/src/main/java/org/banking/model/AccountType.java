package org.banking.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="accounttype")
public class AccountType {
	@Id
	@Column(name="ID")
private	int Id;
	@Column(name="name",nullable=false)
private	TypeOfAccounts name;
	@OneToMany(mappedBy="accountType")
	private List<Account> account;
	
public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public TypeOfAccounts getName() {
	return name;
}
public void setName(TypeOfAccounts name) {
	this.name = name;
}


}
