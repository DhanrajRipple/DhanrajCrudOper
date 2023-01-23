package com.dhanraj.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Jobs {

    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SequenceSubCategoryId")
    @SequenceGenerator(name = "SequenceSubCategoryId", sequenceName = "SUB_CATEGORY_SEQ")
    private int id;
    private String job_title;
    private String location;
    private String job_type;
    private String status;
    private String createdby;
    private String updatedby;
    
    
	public Jobs() {
		super();
	}
	public Jobs(int id, String job_title, String location, String job_type, String status, String createdby,
			String updatedby) {
		super();
		this.id = id;
		this.job_title = job_title;
		this.location = location;
		this.job_type = job_type;
		this.status = status;
		this.createdby = createdby;
		this.updatedby = updatedby;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getJob_type() {
		return job_type;
	}
	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
    
    
}
