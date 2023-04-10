package com.morais.socialcommerce.entrypoint.controller;

import com.morais.socialcommerce.core.domain.Customer;
import com.morais.socialcommerce.core.usecase.FindCustomerByEmailUseCase;
import com.morais.socialcommerce.core.usecase.InsertCustomerUseCase;
import com.morais.socialcommerce.core.usecase.UpdateCustomerUseCase;
import com.morais.socialcommerce.dataprovider.repository.entity.CustomerEntity;
import com.morais.socialcommerce.entrypoint.mapper.CustomerMapper;
import com.morais.socialcommerce.entrypoint.request.CustomerRequest;
import com.morais.socialcommerce.entrypoint.request.LoginRequest;
import com.morais.socialcommerce.entrypoint.response.LoginResponse;
import com.morais.socialcommerce.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
