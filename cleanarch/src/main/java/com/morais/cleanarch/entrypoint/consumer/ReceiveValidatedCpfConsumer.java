package com.morais.cleanarch.entrypoint.consumer;

import com.morais.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.morais.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.morais.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {


    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "morais")
    public void receive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }
}
