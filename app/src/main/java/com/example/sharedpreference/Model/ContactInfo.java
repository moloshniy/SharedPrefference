package com.example.sharedpreference.Model;

import java.io.Serializable;

public class ContactInfo implements Serializable {
    private String phone;
    private String email;

    public ContactInfo(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
