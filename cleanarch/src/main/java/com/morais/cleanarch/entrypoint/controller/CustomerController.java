package com.morais.cleanarch.entrypoint.controller;

import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.core.usecase.customer.FindCustomerByIdUseCase;
import com.morais.cleanarch.core.usecase.customer.InsertCustomerUseCase;
import com.morais.cleanarch.core.usecase.customer.UpdateCustomerUseCase;
import com.morais.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.morais.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.morais.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;


    @Autowired
    private CustomerMapper customerMapper;
    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        Customer customer = customerMapper.toCustomer(customerRequest);
        System.out.println(customer);
        insertCustomerUseCase.insert(customer);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }


    @PutMapping("/{id}")
    public  ResponseEntity<Void> update(@PathVariable final String id, @Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUseCase.update(customer);
        return ResponseEntity.noContent().build();
    }
}
