package com.anjan.LeaveManagement.model;
// default package
// Generated Feb 23, 2018 4:22:57 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Leaves generated by hbm2java
 */
@Entity
@Table(name = "leaves", catalog = "DB_Leave")
public class Leaves implements java.io.Serializable {

	private Integer id;
	private String leaveType;
	private String description;
	private Date startDate;
	private Date endDate;
	private int duration;
	private int empId;
	private String managerComment;

	public Leaves() {
	}

	public Leaves(String leaveType, String description, Date startDate, Date endDate, int duration, int empId,
			String managerComment) {
		this.leaveType = leaveType;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
		this.empId = empId;
		this.managerComment = managerComment;
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

	@Column(name = "leave_type", nullable = false, length = 20)
	public String getLeaveType() {
		return this.leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	@Column(name = "description", nullable = false, length = 250)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", nullable = false, length = 19)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", nullable = false, length = 19)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "duration", nullable = false)
	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Column(name = "emp_id", nullable = false)
	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Column(name = "manager_comment", nullable = false, length = 250)
	public String getManagerComment() {
		return this.managerComment;
	}

	public void setManagerComment(String managerComment) {
		this.managerComment = managerComment;
	}

	@Override
	public String toString() {
		return "Leaves [id=" + id + ", leaveType=" + leaveType + ", description=" + description + ", startDate="
				+ startDate + ", endDate=" + endDate + ", duration=" + duration + ", empId=" + empId
				+ ", managerComment=" + managerComment + "]";
	}
	
	

}
