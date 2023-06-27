package com.example.placement.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", qualification=" + qualification + ", course="
				+ course + ", yearOfPassing=" + yearOfPassing + ", certificates=" + certificates + ", hallTicketNumber="
				+ hallTicketNumber + "]";
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the yearOfPassing
	 */
	public Long getYearOfPassing() {
		return yearOfPassing;
	}
	/**
	 * @param yearOfPassing the yearOfPassing to set
	 */
	public void setYearOfPassing(Long yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	/**
	 * @return the certificates
	 */
	public String getCertificates() {
		return certificates;
	}
	/**
	 * @param certificates the certificates to set
	 */
	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}
	/**
	 * @return the hallTicketNumber
	 */
	public Long getHallTicketNumber() {
		return hallTicketNumber;
	}
	/**
	 * @param hallTicketNumber the hallTicketNumber to set
	 */
	public void setHallTicketNumber(Long hallTicketNumber) {
		this.hallTicketNumber = hallTicketNumber;
	}
	
	
	
	/**
	 * @param id
	 * @param studentName
	 * @param qualification
	 * @param course
	 * @param yearOfPassing
	 * @param certificates
	 * @param hallTicketNumber
	 */
	public Student(Long id, String studentName, String qualification, String course, Long yearOfPassing,
			String certificates, Long hallTicketNumber) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.qualification = qualification;
		this.course = course;
		this.yearOfPassing = yearOfPassing;
		this.certificates = certificates;
		this.hallTicketNumber = hallTicketNumber;
	}
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param id
	 * @param studentName
	 * @param qualification
	 * @param course
	 * @param yearOfPassing
	 * @param certificates
	 * @param hallTicketNumber
	 */
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	@Id
	
	private Long id;
	@Column(name="studentname")
	private String studentName;
	private String qualification;
	private String course;
	@Column(name="yearofpassing")
	private Long yearOfPassing;
	private String  certificates;
	@Column(name="hallticketnumber")
	private Long hallTicketNumber;

	

}
