package com.morais.cleanarch.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.morais.cleanarch.dataprovider.customer.repository.entity.CustomerEntity;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Service
public class TokenService {

    public String generateToken(CustomerEntity customerEntity){
      return  JWT.create().withIssuer("Products").
                withSubject(customerEntity.getUsername()).
                withClaim("id", customerEntity.getId())
                .withExpiresAt(Date.from(LocalDateTime.now().plusMinutes(10).toInstant(ZoneOffset.of("-03:00")))).sign(Algorithm.HMAC256("secreta"));
    }
}
