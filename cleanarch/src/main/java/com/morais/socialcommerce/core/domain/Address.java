package com.morais.socialcommerce.core.domain;

public class Address {

    private String id;
    private  String street;
    private String city;

    private  String uf;

    private  String zipCode;

    public Address(){}

    public Address(String id, String street, String city, String uf, String zipCode) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.uf = uf;
        this.zipCode = zipCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
