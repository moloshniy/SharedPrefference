package com.example.sharedpreference.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class UserEntity implements Serializable {

    private ContactInfo contactInfo;
    private Profile profile;

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public Profile getProfile() {
        return profile;
    }

    public UserEntity(ContactInfo contactInfo, Profile profile) {
        this.contactInfo = contactInfo;
        this.profile = profile;
    }
}
