package org.banking.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Entity
@Table(name="customer")
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Customer implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -7298450731342789863L;
	@Id
	@Column(name="id",nullable=false)
	private int customerId;
	@Column(name="name")
	private String name;
	@Column(name="address")
	
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="country")
	private String country;
	@Column(name="phone")
	private String phone;

@OneToMany(targetEntity=Account.class,fetch=FetchType.EAGER,cascade = CascadeType.ALL,mappedBy="customer1")




	//@JoinColumn(name = "account",referencedColumnName="accountNumber",unique=true, nullable=false)

private Set<Account> account;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


}
