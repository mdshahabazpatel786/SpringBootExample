package com.example.microservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Citizen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String citizenName;
	
	@Column
	private int centerId;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCitizenName() {
		return citizenName;
	}



	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}



	public int getCenterId() {
		return centerId;
	}



	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}



	@Override
	public String toString() {
		return "Citizen [id=" + id + ", citizenName=" + citizenName + ", centerId=" + centerId + "]";
	}
	
	

}
