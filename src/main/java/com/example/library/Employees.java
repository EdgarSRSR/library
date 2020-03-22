package com.example.library;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    @Column
    private String fio;
    @Column
    private String telephone;
    @Column
    private String jobPos;
    @Column
    private String department;
    @Column
    private String email;
    @Column
    private Boolean admin;

    public Employees(){}

    public Employees(int employeeId, String fio, String telephone,String jobPos, String department,
        String email, Boolean admin){
        this.employeeId = employeeId;
        this.fio = fio;
        this.telephone = telephone;
        this.jobPos = jobPos;
        this.department = department;
        this.email = email;
        this.admin = admin;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getJobPos() {
        return jobPos;
    }

    public void setJobPos(String jobPos) {
        this.jobPos = jobPos;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}
