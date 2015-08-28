package org.banking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account implements Serializable{
	private static final long serialVersionUID = 2309690787578132207L;
	@Id
	
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="accountNumber",nullable=false)
	private int accountNumber;
	 
	 @ManyToOne
	   @JoinColumn(name="Id")
	private AccountType accountType;
	 @ManyToOne
	
	   @JoinColumn(name="customerId")
	private Customer customer1;
	@Column(name="Balance")
	private int balance;
	@Column(name="status")
	@Enumerated(EnumType.ORDINAL)
	private Status status;
	@Column(name="active")
	@Enumerated(EnumType.ORDINAL)
	private Active active;
	@Column(name="createdDate")

	private  java.sql.Date createdDate;
	
	@OneToOne
	@JoinColumn(name="createdname",referencedColumnName="name",insertable=false,updatable=false,unique=true)
	private Customer createdUser;
	
	@Column(name="ModifiedDate")

	private java.sql.Date modifiedDate;
	@OneToOne
	@JoinColumn(name="modifiedname",referencedColumnName="name",unique=true)
	private Customer modifiedUser;
	
	public Customer getCustomer() {
		return customer1;
	}
	public void setCustomer(Customer customer) {
		this.customer1 = customer;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Active getActive() {
		return active;
	}
	public void setActive(Active active) {
		this.active = active;
	}
	
	public Customer getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(Customer createdUser) {
		this.createdUser = createdUser;
	}
	
	
	public Customer getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(Customer modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	public Customer getCustomer1() {
		return customer1;
	}
	public void setCustomer1(Customer customer1) {
		this.customer1 = customer1;
	}
	public java.sql.Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(java.sql.Date createdDate) {
		this.createdDate = createdDate;
	}
	public java.sql.Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(java.sql.Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	

	

}
