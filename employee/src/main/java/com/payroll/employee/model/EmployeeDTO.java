package com.payroll.employee.model;

import com.payroll.employee.model.Address;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class EmployeeDTO {

    private String empId;
    private String firstName;
    private String lastName;
    private Date dob;
    private String panNo;
    private String mobile;
    private String adhaar;
    //private Designation designation;
    private Address address;

}
