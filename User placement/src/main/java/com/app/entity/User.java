package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tuser")
public class User {
	@Id
	@Column(name="id")
	private long Id;
	private String name;
	private String type;
	private String password;
	
	
	private User() {
		super();
	
	}
	private User(long id, String name, String type, String password) {
		super();
		Id = id;
		this.name = name;
		this.type = type;
		this.password = password;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", type=" + type + ", password=" + password + "]";
	}
	

}
