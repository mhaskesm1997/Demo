package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.Students;

public interface stdRepo extends JpaRepository<Students, Integer>
{
	Students findByRollNo(int rollNo); 
	Students findById(int stdid);
	
	 @Query
	 (
			 value = "SELECT std_name from students where batch_id=?1",
			 nativeQuery = true
	 )
	List<Object> GetTheStudentsnameByUsingBatchId(int batchId);
}
