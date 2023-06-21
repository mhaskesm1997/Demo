package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.Batch;
import com.example.demo.Entity.Students;
import com.example.demo.Repository.batchRepo;
import com.example.demo.Repository.stdRepo;

@RestController
public class MyController
{
	@Autowired
	stdRepo stdRepo;

	@Autowired
	batchRepo batchRepo;
	
	@PostMapping("addStudent")
	public boolean addStudent(@RequestBody Students std)
	{
		try
		{
			stdRepo.save(std);
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
	@PostMapping("addBatch")
	public boolean addBatch(@RequestBody Batch batch )
	{
		try
		{
			batchRepo.save(batch);
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		
	}
	@PostMapping("addStudentsinBatch{stdid}and{batchid}")
	public boolean addStudentsinBatch(@PathVariable int stdid,@PathVariable int batchid )
	{
		try
		{
			Students std1 = stdRepo.findById(stdid);
			System.out.println(std1);
			Batch batch = batchRepo.findById(batchid);
			std1.setBatch(batch);
			stdRepo.save(std1);
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		
	}
	
	@DeleteMapping("deleteStudentUsingStdId{StdId}")
	public boolean deleteStudentUsingStdId(@PathVariable int StdId)
	{
		try
		{
			stdRepo.deleteById(StdId);
			return true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}		
	}
	
	@GetMapping("GetTheStudentsnameByUsingBatchId{batchId}")
	public List<Object> GetTheStudentsnameByUsingBatchId(@PathVariable int batchId)
	{
		try
		{
		
			return stdRepo.GetTheStudentsnameByUsingBatchId(batchId);
			 
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}	
	}
	
	@PostMapping("updateStudentmark{rollNo}and{marks}")
	public boolean updateStudentmark(@PathVariable int rollNo,@PathVariable int marks)
	{
		try
		{
			Students std = stdRepo.findByRollNo(rollNo);
			std.setMarks(marks);
			stdRepo.save(std);
			return true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	@PostMapping("ChangetheBacthofStudent{rollNo}and{batchId}")
	public boolean ChangetheBacthofStudent(@PathVariable int rollNo,@PathVariable int batchId)
	{
		try
		{
			Students std1 = stdRepo.findByRollNo(rollNo);
			Batch batch = batchRepo.findById(batchId);
			std1.setBatch(batch);
			stdRepo.save(std1);
			return true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

}
