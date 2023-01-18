package com.student.Controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Entity.Student;


@RestController
@RequestMapping("/api/student")
public class StudentsController {
	
	
	private static final java.util.List<Student> students= Arrays.asList(
			new Student(1, "yogesh"),
			new Student(2, "sagar"),
			new Student(3, "jaant")
			);
	
	@GetMapping("/{id}")
	public Student studentdetails(@PathVariable("id") Long id)
	{
	
		return students.stream().filter(student -> id.equals(student.getId())).findFirst().orElseThrow(() -> new IllegalStateException("student is not present"));
	}

}
