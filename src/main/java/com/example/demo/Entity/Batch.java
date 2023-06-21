package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Batch
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String batchName;
	String batchTrainer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getBatchTrainer() {
		return batchTrainer;
	}
	public void setBatchTrainer(String batchTrainer) {
		this.batchTrainer = batchTrainer;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Batch(int id, String batchName, String batchTrainer) {
		super();
		this.id = id;
		this.batchName = batchName;
		this.batchTrainer = batchTrainer;
	}
	@Override
	public String toString() {
		return "Batch [id=" + id + ", batchName=" + batchName + ", batchTrainer=" + batchTrainer + "]";
	}
	
	
	

}
