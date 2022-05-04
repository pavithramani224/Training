package com.training.resource;

import java.util.List;

import com.training.model.Student;
import com.training.service.StudentService;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/students")
public class StudentResource {
	private static StudentService service= new StudentService();
	
	public StudentResource() {
		super();
		
	}
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Student getAllStudent() {
//		Student ram = new Student(101,"ram",98);
//		return ram;
//	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudent() {
		
		return service.getAll();
	}
	@GET
	@Path("/{rollnumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student findById(@PathParam("rollNumber")int id) {
		
		return service.findById(id).orElseThrow(()-> new RuntimeException("Id Not Found"));
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Student add(Student student) {
		boolean result = service.add(student);
		if(result) {
			return student;
		}else {
			return null;
		}
		
	}
	@DELETE
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean remove(@PathParam("rollNumber")int id) {
		
		return service.remove(id);
	}
	
	


}
