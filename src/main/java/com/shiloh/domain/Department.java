package com.shiloh.domain;

import java.util.List;

import javax.annotation.Generated;

/**
 * Department is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class Department {

    private Integer companyId;

    private String createdBy;

    private org.joda.time.DateTime createdOn;

    private String description;

    private Integer id;

    private String lastModifiedBy;

    private org.joda.time.DateTime lastModifiedOn;

    private String name;
    
    private List<Employee> employees;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public org.joda.time.DateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(org.joda.time.DateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public org.joda.time.DateTime getLastModifiedOn() {
        return lastModifiedOn;
    }

    public void setLastModifiedOn(org.joda.time.DateTime lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}

