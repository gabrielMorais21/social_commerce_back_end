package com.morais.cleanarch.core.usecase.impl;

import com.morais.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.morais.cleanarch.core.dataprovider.InsertCustomer;
import com.morais.cleanarch.core.dataprovider.SendCpfForValidation;
import com.morais.cleanarch.core.domain.Address;
import com.morais.cleanarch.core.domain.Customer;
import com.morais.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private  final FindAddressByZipCode findAddressByZipCode;
    private  final InsertCustomer insertCustomer;

    private  final SendCpfForValidation sendCpfForValidate;
    public  InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer, SendCpfForValidation sendCpfForValidate){
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
        this.sendCpfForValidate = sendCpfForValidate;
    }
    @Override
    public void insert(Customer customer, String zipCode) {
        Address address  = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
        sendCpfForValidate.send(customer.getCpf());
    }
}
