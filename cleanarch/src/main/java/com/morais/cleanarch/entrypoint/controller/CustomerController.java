package com.morais.cleanarch.entrypoint.controller;

import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.core.usecase.customer.FindCustomerByEmailUseCase;
import com.morais.cleanarch.core.usecase.customer.InsertCustomerUseCase;
import com.morais.cleanarch.core.usecase.customer.UpdateCustomerUseCase;
import com.morais.cleanarch.dataprovider.customer.repository.entity.CustomerEntity;
import com.morais.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.morais.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.morais.cleanarch.entrypoint.controller.request.LoginRequest;
import com.morais.cleanarch.entrypoint.controller.response.CustomerResponse;
import com.morais.cleanarch.entrypoint.controller.response.LoginResponse;
import com.morais.cleanarch.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private FindCustomerByEmailUseCase findCustomerByEmailUseCase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        Customer customer = customerMapper.toCustomer(customerRequest);
        customer.setPassword(encoder.encode(customer.getPassword()));
        insertCustomerUseCase.insert(customer);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> validarSenha(@RequestBody LoginRequest loginRequest) {

        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword());

        Authentication authenticaticate =  this.authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        var customerEntity  =  (CustomerEntity) authenticaticate.getPrincipal();
        LoginResponse loginResponse = new LoginResponse();
            loginResponse.setToken(tokenService.generateToken(customerEntity));
        return ResponseEntity.ok().body(loginResponse);


    }



    @PutMapping("/{id}")
    public  ResponseEntity<Void> update(@PathVariable final String id, @Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUseCase.update(customer);
        return ResponseEntity.noContent().build();
    }
}
