package com.payroll.payroll.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.payroll.payroll.model.Employee;
import com.payroll.payroll.model.Users;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReqRes {

    public void setError(String error) {
        this.error = error;
    }


    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setRole(String role) {
        this.role = role;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;
    private String name;
    private String email;

    public String getToken() {
        return token;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public String getPassword() {
        return password;
    }

    public Users getUsers() {
        return users;
    }

    private String role;
    private String password;
    private List<Employee> employeeList;
    private Users users;

    public String getEmail() {
        return email;
    }
}
