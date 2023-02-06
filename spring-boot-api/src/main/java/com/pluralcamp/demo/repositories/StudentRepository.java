 package com.pluralcamp.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pluralcamp.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	//Esto seria como: select * from student where name= ?
	List<Student> findByName(String name);//findByName es un metodo creado, para otro metodos ya implementados se puede usar la API de spring(JpaRepository)

	//select * from student where name= ? and surname = ?
	List<Student> findByNameAndSurname(String name, String surname);
	
	//select * from student where age = ?
	//List<Student> findByAge(int age);
	
	//En el caso de una query personalizada sería utilizando HQL:
	@Query("SELECT s FROM Student s WHERE s.age = :age")
	List<Student> findByAge(@Param("age") int age);
}
