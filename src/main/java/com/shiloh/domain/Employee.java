package com.shiloh.domain;

import javax.annotation.Generated;

/**
 * Employee is a Querydsl bean type
 */
@Generated("com.querydsl.codegen.BeanSerializer")
public class Employee {

    private String createdBy;

    private org.joda.time.DateTime createdOn;

    private Integer departmentId;

    private String description;

    private String firstName;

    private Integer id;

    private String lastModifiedBy;

    private org.joda.time.DateTime lastModifiedOn;

    private String lastName;

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

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

