package com.morais.socialcommerce.entrypoint.response;

import com.morais.socialcommerce.entrypoint.request.AddressRequest;
import lombok.Data;

@Data
public class CustomerResponse {
    private String name;

    private String lastName;

    private String  email;

    private String rg;

    private String cellPhone;

    private String landlinePhone;

    private String cpf;

    private AddressRequest address;
}
