package com.payroll.address.controller;

import com.payroll.address.config.Error;
import com.payroll.address.config.ResponseControl;
import com.payroll.address.model.Address;
import com.payroll.address.model.AddressDTO;
import com.payroll.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class Controller {

    @Autowired
    private AddressRepository repository;

    @GetMapping
    public ResponseControl<List<Address>> getAddresses() {
        List<Address> list = repository.findAll();
        ResponseControl<List<Address>> responseControl = new ResponseControl<List<Address>>(String.valueOf(Math.random()), list, null);
        return responseControl;
    }

    @GetMapping
    @RequestMapping("{employeeId}")
    public ResponseControl<List<Address>> getAddress(@PathVariable String employeeId) {
        List<Address> addresses = repository.findByEmployeeId(employeeId);
        ResponseControl<List<Address>> responseControl = new ResponseControl<List<Address>>(String.valueOf(Math.random()), addresses, null);
        return responseControl;
    }

    @PostMapping
    public ResponseControl<String> saveAddress(@RequestBody @Valid Address address) {
        Address address1 = repository.save(address);
        ResponseControl<String> responseControl = new ResponseControl<String>(String.valueOf(Math.random()), "Success", null);
        return responseControl;
    }

    @DeleteMapping
    public ResponseControl<String> deleteAddress(@RequestBody @Valid Address address) {
        Optional<Address> response = repository.findById(address.get_id());
        if (response.isPresent()) {
            repository.delete(address);
            return new ResponseControl<String>(String.valueOf(Math.random()), "Success", null);
        } else {
            Error error = new Error();
            error.setId("4004");
            error.setMessage("Record not available");
            return new ResponseControl<String>(String.valueOf(Math.random()), null, Arrays.asList(error));
        }
    }

}
