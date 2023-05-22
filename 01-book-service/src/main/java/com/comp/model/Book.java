package com.comp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String author;
	private String title;
	private Date launchDate;
	private Double price;
	private String currency;
	private String evironment;

	public Book() {

	}

	public Book(Long id, String author, String title, Date launchDate, Double price, String currency,
			String evironment) {
		
		this.id = id;
		this.author = author;
		this.title = title;
		this.launchDate = launchDate;
		this.price = price;
		this.currency = currency;
		this.evironment = evironment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getEvironment() {
		return evironment;
	}

	public void setEvironment(String evironment) {
		this.evironment = evironment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, currency, evironment, id, launchDate, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(currency, other.currency)
				&& Objects.equals(evironment, other.evironment) && Objects.equals(id, other.id)
				&& Objects.equals(launchDate, other.launchDate) && Objects.equals(price, other.price)
				&& Objects.equals(title, other.title);
	}
	
}
