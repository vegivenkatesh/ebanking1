package org.banking.model;

import java.util.Date;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Account")
public class Account {
	@Id
	
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountNumber;
	 @ManyToOne(targetEntity = Customer.class)
	    @JoinColumn(name = "customer_id",referencedColumnName="id",nullable=false)
	private Customer customerid;
	 
	
	
	
	
	@ManyToOne(targetEntity = AccountType.class)
	    @JoinColumn(name = "account_type",referencedColumnName="ID",nullable=false)
	private AccountType accountType;
	@Column(name="Balance",nullable=false)
	private int balance;
	@Column(name="status",nullable=false)
	@Enumerated(EnumType.ORDINAL)
	private Status status;
	@Column(name="active",nullable=false)
	@Enumerated(EnumType.ORDINAL)
	private Active active;
	@Column(name="createDate",nullable=false)
	private Date createdDate;
	@OneToOne
	@JoinColumn(name="createdname",referencedColumnName="name",nullable=false,insertable=false,updatable=false)
	private Customer createdUser;
	
	@Column(name="ModifiedDate",nullable=false)
	private Date modifiedDate;
	@OneToOne
	@JoinColumn(name="modifiedname",referencedColumnName="name",nullable=false)
	private Customer modifiedUser;
	public Customer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Customer customerid) {
		this.customerid = customerid;
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Customer getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(Customer createdUser) {
		this.createdUser = createdUser;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Customer getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(Customer modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	

}
