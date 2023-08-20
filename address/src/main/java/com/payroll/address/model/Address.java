package com.payroll.address.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {

    private String _id;
    private String employeeId;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String landmark;
    private String pinCode;

    public Address() {
    }

    public Address(AddressDTO dto) {
        this.address1 = dto.getAddress1();
        this.address2 = dto.getAddress2();
        this.city = dto.getCity();
        this.state = dto.getState();
        this.country = dto.getCountry();
        this.landmark = dto.getLandmark();
        this.pinCode = dto.getPinCode();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}
