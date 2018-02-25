package com.anjan.LeaveManagement.model;
// default package
// Generated Feb 25, 2018 9:04:49 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Department generated by hbm2java
 */
@Entity
@Table(name = "department", catalog = "db_leave")
public class Department implements java.io.Serializable {

	private Integer id;
	private int empId;
	private String name;

	public Department() {
	}

	public Department(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "emp_id", nullable = false)
	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Column(name = "name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
