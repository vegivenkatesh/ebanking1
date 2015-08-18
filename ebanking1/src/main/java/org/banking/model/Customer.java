package org.banking.model;

import java.io.Serializable;
import java.util.List;










import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity
@Table(name="customer")
public class Customer implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -7298450731342789863L;
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

	@OneToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL,mappedBy="customer1")
	//@JoinColumn(name = "account",referencedColumnName="accountNumber",unique=true, nullable=false)
	
	
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
