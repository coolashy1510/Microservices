package com.demo.voucherservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Voucher {

    private Long voucherIdentifier;
    private String lastName;
    private String currencyCode;
    private int port;

    @Id
    @GeneratedValue
    public Long getVoucherIdentifier() {
        return voucherIdentifier;
    }

    public void setVoucherIdentifier(Long voucherIdentifier) {
        this.voucherIdentifier = voucherIdentifier;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
