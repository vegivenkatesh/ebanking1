package org.banking.model;

import java.util.List;






import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="customer")
public class Customer {
	

	@Id
	@Column(name="id")
	private int customerId;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="Address",nullable=false)
	private String Address;
	@Column(name="City",nullable=false)
	private String City;
	@Column(name="Country",nullable=false)
	private String Country;
	@Column(name="Phone",nullable=false)
	private String Phone;
	@OneToMany(mappedBy="customerid")
	private List<Account> account;
	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	
	public int getcustomerId() {
		return customerId;
	}
	public void setcustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name1) {
		name = name1;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}

}
