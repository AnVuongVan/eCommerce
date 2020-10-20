package com.vietis.ecommerce.model;

public class Orders {
    private String address;
    private String name;
    private String phone;
    private String city;
    private String state;
    private String totalAmount;
    private String date;
    private String time;

    public Orders() {
    }

    public Orders(String address, String name, String phone, String city, String state, String totalAmount, String date, String time) {
        this.address = address;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.totalAmount = totalAmount;
        this.date = date;
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
