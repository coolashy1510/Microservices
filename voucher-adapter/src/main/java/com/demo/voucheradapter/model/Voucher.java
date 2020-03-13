package com.demo.voucheradapter.model;

public class Voucher {

    private Long voucherIdentifier;
    private String lastName;
    private String currencyCode;
    private String port;

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

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
