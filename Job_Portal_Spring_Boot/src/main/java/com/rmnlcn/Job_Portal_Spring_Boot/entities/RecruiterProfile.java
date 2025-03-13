package com.rmnlcn.Job_Portal_Spring_Boot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "jp_recruiter_profile")
public class RecruiterProfile {

    // fields
    @Id
    @Column(name = "r_p_fk_user_id")
    private int userAccountIdForRecruiterProfile;

    @OneToOne
    @JoinColumn(name="r_p_fk_user_id")
    @MapsId
    private Users userId;

    @Column(name = "r_p_first_name")
    private String firstName;

    @Column(name = "r_p_last_name")
    private String lastName;

    @Column(name = "r_p_city")
    private String city;

    @Column(name = "r_p_state")
    private String state;

    @Column(name = "r_p_country")
    private String country;

    @Column(name = "r_p_company")
    private String company;

    @Column(nullable = true, name = "r_p_photo", length = 64)
    private String profilePhoto;


    // constructors
    public RecruiterProfile() {}

    public RecruiterProfile(int userAccountIdForRecruiterProfile, Users userId, String firstName, String lastName, String city, String state, String country, String company, String profilePhoto) {
        this.userAccountIdForRecruiterProfile = userAccountIdForRecruiterProfile;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.company = company;
        this.profilePhoto = profilePhoto;
    }


    // getters/setters
    public int getUserAccountIdForRecruiterProfile() {
        return userAccountIdForRecruiterProfile;
    }

    public void setUserAccountIdForRecruiterProfile(int userAccountIdForRecruiterProfile) {
        this.userAccountIdForRecruiterProfile = userAccountIdForRecruiterProfile;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }


    // toString() method
    @Override
    public String toString() {
        return "RecruiterProfile{" +
                "userAccountIdForRecruiterProfile=" + userAccountIdForRecruiterProfile +
                ", userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", company='" + company + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                '}';
    }
}
