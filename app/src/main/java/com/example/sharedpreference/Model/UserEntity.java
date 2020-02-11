package com.example.sharedpreference.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class UserEntity implements Parcelable {

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

    protected UserEntity(Parcel in) {

        String phone = in.readString();
        String email = in.readString();
        String name = in.readString();
        int age = in.readInt();

        this.contactInfo = new ContactInfo(phone, email);
        this.profile = new Profile(age, name);
    }

    public static final Creator<UserEntity> CREATOR = new Creator<UserEntity>() {
        @Override
        public UserEntity createFromParcel(Parcel in) {
            return new UserEntity(in);
        }

        @Override
        public UserEntity[] newArray(int size) {
            return new UserEntity[size];
        }
    };

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(contactInfo.getPhone());
        dest.writeString(contactInfo.getEmail());
        dest.writeString(profile.getName());
        dest.writeInt(profile.getAge());
    }
}
