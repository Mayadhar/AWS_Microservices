package com.payroll.address.repository;

import com.payroll.address.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AddressRepository extends MongoRepository<Address, String> {

    @Query("SELECT a FROM Address a WHERE a.employeeId = ?1")
    List<Address> findByEmployeeId(String employeeId);
}
