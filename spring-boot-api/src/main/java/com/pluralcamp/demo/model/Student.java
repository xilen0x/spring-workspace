package com.pluralcamp.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   // <-- obligatorio para que la API sepa que esta es una entidad de negocio
@Table(name="student") //nombre de la tabla en la DB
public class Student {

	//Attributs(para idstudent el cual es Primary Key) - Cada atributo es una columna de la DB
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//para indicar que la tabla tiene un id autogenerado
	private int idstudent;
	@Column     //@Column es para el resto que no son PK
	private String name;
	@Column
	private String surname;
	@Column
	private int age;

	
	//Gets&Sets
	public int getIdstudent() {
		return idstudent;
	}
	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
