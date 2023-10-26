package com.fertilizers.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fertilizer {
	
	@Id
	private String id;
	
	private String fertilizerName;
	
	public Fertilizer() {
		super();
		
	}
	

	public Fertilizer(String id, String fertilizerName) {
		super();
		this.id = id;
		this.fertilizerName = fertilizerName;
	}
	
	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}


	public String getFertilizerName() {
		return fertilizerName;
	}


	public void setFertilizerName(String fertilizerName) {
		this.fertilizerName = fertilizerName;
	}

	
	
}
