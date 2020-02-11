package com.example.sharedpreference;

import com.example.sharedpreference.Model.ContactInfo;
import com.example.sharedpreference.Model.Profile;
import com.example.sharedpreference.Model.UserEntity;

public class DataProvider {

    public UserEntity getUser(){
        String email = "someEmail@mail.ru";
        String phone = "093 - 468 - 23 - 23";
        String name = "Alex";
        int age = 22;
        ContactInfo contactInfo = new ContactInfo(phone,email);
        Profile profile = new Profile(age, name);
        UserEntity userEntity = new UserEntity(contactInfo,profile);
        return userEntity;
    }
}
