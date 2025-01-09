package com.github.claudioweiler.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SimpleEntity {
	
	@Id
	private long id;
	
	private String nothing;
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	public void setNothing(String nothing) {
		this.nothing = nothing;
	}
	
	public String getNothing() {
		return nothing;
	}
}
