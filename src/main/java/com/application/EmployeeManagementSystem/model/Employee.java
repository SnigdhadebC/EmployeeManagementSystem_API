package com.application.EmployeeManagementSystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private long empId;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="emp_salary")
	private long salary;
	
	@Column(name="emp_hiredate")
	@Temporal(TemporalType.DATE)
	private Date hireDate;
		
	/**
	 * 
	 */
	public Employee() {
		super();
	}
	/**
	 * 
	 * @param empId
	 * @param name
	 * @param salary
	 * @param hireDate
	 */
	public Employee(long empId, String name, long salary, Date hireDate) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	/**
	 * @return the empId
	 */
	public long getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public long getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(long salary) {
		this.salary = salary;
	}
	/**
	 * @return the hireDate
	 */
	public Date getHireDate() {
		return hireDate;
	}
	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}
	
}
