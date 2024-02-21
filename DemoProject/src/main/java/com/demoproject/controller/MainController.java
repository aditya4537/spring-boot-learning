package com.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demoproject.dto.ResponseDto;
import com.demoproject.entity.Student;
import com.demoproject.service.StudentService;

@Controller
@RequestMapping("/student")
public class MainController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/get")
	@ResponseBody
	public List<Student> getAllStudents() {
		 return studentService.getAllStudents();
	}
	
	@PostMapping("/save")
	@ResponseBody
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public ResponseEntity<ResponseDto> deleteSudent(@RequestParam("studentId") long studeId) {
		studentService.deleteStudent(studeId);
		ResponseDto responseDto = new ResponseDto();
		responseDto.setData("Student data deleted");
		responseDto.setMessage("ok");
		responseDto.setStatus(200);
		return new ResponseEntity<>(responseDto,HttpStatusCode.valueOf(200));
	}
}
