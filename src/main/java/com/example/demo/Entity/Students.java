package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Students
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int Id;
	String stdName;
	int rollNo;
	int Marks;
	
	@ManyToOne
	Batch batch;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int id, String stdName, int rollNo, int marks, Batch batch) {
		super();
		Id = id;
		this.stdName = stdName;
		this.rollNo = rollNo;
		Marks = marks;
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Students [Id=" + Id + ", stdName=" + stdName + ", rollNo=" + rollNo + ", Marks=" + Marks + ", batch="
				+ batch + "]";
	}
	
	
	
	
		

}
