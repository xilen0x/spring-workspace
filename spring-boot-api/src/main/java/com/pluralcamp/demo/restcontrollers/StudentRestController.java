package com.pluralcamp.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pluralcamp.demo.exceptions.ResourceNotFoundException;
import com.pluralcamp.demo.model.Student;
import com.pluralcamp.demo.service.StudentService;

@RestController
@RequestMapping("student") //path
@CrossOrigin
public class StudentRestController {
	
	@Autowired
	private StudentService studentService;
	
	/*Retorna la lista de estudiantes*/
	@CrossOrigin //corroborar si es necesario poner esto aqui tb
	@GetMapping(path = "/students", produces = "application/json")
	public ResponseEntity<List<Student>> getStudents(){
		
		List<Student> studentList = this.studentService.getStudents();
		return ResponseEntity.ok(studentList);
	}
	
	/*Retorna la lista de estudiantes por nombre*/
	@GetMapping(path = "/students/{name}", produces = "application/json")
	public ResponseEntity<List<Student>> getStudentsByName(@PathVariable("name") String name){
		List<Student> studentList = this.studentService.getStudentsByName(name);
		return ResponseEntity.ok(studentList);
	}
	
	/*Retorna la lista de estudiantes por nombre y apellido*/
	@GetMapping(path = "/students/{name}/{surname}", produces = "application/json")
	public ResponseEntity<List<Student>> getStudentsByNameAndSurname(
			@PathVariable("name") String name,
			@PathVariable("surname") String surname){
		List<Student> studentList = this.studentService.getStudentsByNameAndSurname(name, surname);
		return ResponseEntity.ok(studentList);
	}
	
	/*Retorna la lista de estudiantes por edad*/
	@GetMapping(path = "/students/{age}", produces = "application/json")
	public ResponseEntity<List<Student>> getStudentsByAge(@PathVariable("age") int age){
		List<Student> studentList = this.studentService.getStudentsByAge(age);
		return ResponseEntity.ok(studentList);
	}
	
	/*Retorna la lista de estudiantes por id*/
	@GetMapping(path = "/students/{id}", produces = "application/json")
	public ResponseEntity<Student> getStudentById(
			@PathVariable("id") int id) throws ResourceNotFoundException{
		Student student = this.studentService.getStudentById(id);
		return ResponseEntity.ok(student);
	}
	
	/*Guardar estudiante en la DB(insert)*/
	@CrossOrigin
	@PostMapping(path = "/students")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		
		Student savedStudent = this.studentService.saveStudent(student);
		return new ResponseEntity<Student>(savedStudent, HttpStatus.CREATED);
	}
	
	/*Actualizar un estudiante- (update)*/
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(
			@RequestBody Student student, 
			@PathVariable("id") int id) 
					throws ResourceNotFoundException{//student = datos nuevos, id= id del estudiante a actualizar
		
		student.setIdstudent(id);
		Student updatedStudent = this.studentService.updateStudent(student);
		return new ResponseEntity<Student>(updatedStudent, HttpStatus.OK);
	
	}
	
	
	
	
	
	
	
	
}
