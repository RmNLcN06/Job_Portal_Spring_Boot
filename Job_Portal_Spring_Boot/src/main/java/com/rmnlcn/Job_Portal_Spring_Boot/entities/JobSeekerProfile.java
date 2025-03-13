package com.rmnlcn.Job_Portal_Spring_Boot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "jp_job_seeker_profile")
public class JobSeekerProfile {

    // fields
    @Id
    @Column(name = "j_s_p_fk_user_id")
    private int userAccountIdForJobSeekerProfile;

    @OneToOne
    @JoinColumn(name = "j_s_p_fk_user_id")
    @MapsId
    private Users userId;

    @Column(name = "j_s_p_first_name")
    private String firstName;

    @Column(name = "j_s_p_last_name")
    private String lastName;

    @Column(name = "j_s_p_city")
    private String city;

    @Column(name = "j_s_p_state")
    private String state;

    @Column(name = "j_s_p_country")
    private String country;

    @Column(name = "j_s_p_work_authorization")
    private String workAuthorization;

    @Column(name = "j_s_p_employment_type")
    private String employmentType;

    @Column(name = "j_s_p_resume")
    private String resume;

    @Column(nullable = true, name = "j_s_p_photo", length = 64)
    private String profilePhoto;


    // constructors
    public JobSeekerProfile() {}

    public JobSeekerProfile(int userAccountIdForJobSeekerProfile, Users userId, String firstName, String lastName, String city, String state, String country, String workAuthorization, String employmentType, String resume, String profilePhoto) {
        this.userAccountIdForJobSeekerProfile = userAccountIdForJobSeekerProfile;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.workAuthorization = workAuthorization;
        this.employmentType = employmentType;
        this.resume = resume;
        this.profilePhoto = profilePhoto;
    }


    // getters / setters
    public int getUserAccountIdForJobSeekerProfile() {
        return userAccountIdForJobSeekerProfile;
    }

    public void setUserAccountIdForJobSeekerProfile(int userAccountIdForJobSeekerProfile) {
        this.userAccountIdForJobSeekerProfile = userAccountIdForJobSeekerProfile;
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

    public String getWorkAuthorization() {
        return workAuthorization;
    }

    public void setWorkAuthorization(String workAuthorization) {
        this.workAuthorization = workAuthorization;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
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
        return "JobSeekerProfile{" +
                "userAccountIdForJobSeekerProfile=" + userAccountIdForJobSeekerProfile +
                ", userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", workAuthorization='" + workAuthorization + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", resume='" + resume + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                '}';
    }
}
