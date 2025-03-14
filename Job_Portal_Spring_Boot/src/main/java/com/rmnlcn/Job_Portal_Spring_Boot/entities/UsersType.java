package com.rmnlcn.Job_Portal_Spring_Boot.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "jp_users_type")
public class UsersType {

    // fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "u_t_id")
    private int userTypeId;

    @Column(name = "u_t_name")
    private String userTypeName;

    @OneToMany(targetEntity = Users.class, mappedBy = "userTypeId", cascade = CascadeType.ALL)
    private List<Users> users;


    // constructors
    public UsersType() {}

    public UsersType(int userTypeId, String userTypeName, List<Users> users) {
        this.userTypeId = userTypeId;
        this.userTypeName = userTypeName;
        this.users = users;
    }


    // getters / setters
    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }


    // toString() method
    @Override
    public String toString() {
        return "UsersType{" +
                "userTypeId=" + userTypeId +
                ", userTypeName='" + userTypeName + '\'' +
                '}';
    }
}
