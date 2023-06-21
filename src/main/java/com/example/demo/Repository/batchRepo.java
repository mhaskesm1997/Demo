package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Batch;

public interface batchRepo extends JpaRepository<Batch, Integer> 
{
	Batch findById(int id);

}
