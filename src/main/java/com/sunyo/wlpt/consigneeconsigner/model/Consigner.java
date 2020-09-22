package com.sunyo.wlpt.consigneeconsigner.model;

public class Consigner {
    private Integer id;

    private String companyName;

    private String conName;

    private String conPhone;

    private String conFax;

    private String country;

    private String conCity;

    private String conAddress;

    private String conPostcode;

    private String conAeo;

    private String enterprise;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName == null ? null : conName.trim();
    }

    public String getConPhone() {
        return conPhone;
    }

    public void setConPhone(String conPhone) {
        this.conPhone = conPhone == null ? null : conPhone.trim();
    }

    public String getConFax() {
        return conFax;
    }

    public void setConFax(String conFax) {
        this.conFax = conFax == null ? null : conFax.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getConCity() {
        return conCity;
    }

    public void setConCity(String conCity) {
        this.conCity = conCity == null ? null : conCity.trim();
    }

    public String getConAddress() {
        return conAddress;
    }

    public void setConAddress(String conAddress) {
        this.conAddress = conAddress == null ? null : conAddress.trim();
    }

    public String getConPostcode() {
        return conPostcode;
    }

    public void setConPostcode(String conPostcode) {
        this.conPostcode = conPostcode == null ? null : conPostcode.trim();
    }

    public String getConAeo() {
        return conAeo;
    }

    public void setConAeo(String conAeo) {
        this.conAeo = conAeo == null ? null : conAeo.trim();
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise == null ? null : enterprise.trim();
    }
}