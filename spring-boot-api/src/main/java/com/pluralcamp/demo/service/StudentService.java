package com.pluralcamp.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralcamp.demo.exceptions.ResourceNotFoundException;
import com.pluralcamp.demo.model.Student;
import com.pluralcamp.demo.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;//null
	
//	public StudentService(StudentRepository repo) { //Esto ya no es necesario aqui pues
//		this.studentRepository = repo;             // lo hace srping con @Autowired
//	}
	
	//-----------------------------CRUD METHODS-------------------------
	
	/*Get the list of Students from DB*/
	public List<Student> getStudents(){
		return studentRepository.findAll();//findAll() es un metodo y implementado de JpaRepository
	}
	
	/*Get the Students BY NAME */
	public List<Student> getStudentsByName(String name){
		return studentRepository.findByName(name);//finByName es un metodo y implementado en la clase StudentRepository
	}
	
	/*Get the Students BY id*/
	public Student getStudentById(int id) throws ResourceNotFoundException{
		Optional<Student> student = studentRepository.findById(id);
		if(!student.isPresent()) {
			throw new ResourceNotFoundException("Recurso no encontrado!");			
		}
		return student.get();
	}
	
	/*Get the Students BY NAME and surname */
	public List<Student> getStudentsByNameAndSurname(String name, String surname){
		return studentRepository.findByNameAndSurname(name, surname);
	}
	
	/*Get the Students BY age */
	public List<Student> getStudentsByAge(int age){
		return studentRepository.findByAge(age);
	}
	
	/*Save a student in the DB*/
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	/*Save a student updated in the DB*/
	public Student updateStudent(Student student) throws ResourceNotFoundException{
		Optional <Student> oldStudent = studentRepository.findById(student.getIdstudent());//primero buscamos el estudiante y lo asigno
		if(!oldStudent.isPresent()) {
			throw new ResourceNotFoundException("Recurso no encontrado!");	
		}else {
			Student studentToUpdate = oldStudent.get();
			studentToUpdate.setName(student.getName());
			studentToUpdate.setSurname(student.getSurname());
			studentToUpdate.setAge(student.getAge());
			
			Student updatedStudent = studentRepository.save(studentToUpdate);
			return updatedStudent;
		}
		
	}
	
}
















