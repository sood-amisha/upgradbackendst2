package com.upgrad.backendst2.Model;

import javax.persistence.*;


@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private  long id;

    @Column(name = "Name",nullable = false)
    private  String Name;

    @Column(name = "MObile",nullable = false)
    private  int Mobile;

    @Column( name = "Email",nullable = false, unique = true, length = 45)
    private String Email;

    public String getName() {
        return Name;
    }

    public int getMobile() {
        return Mobile;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMobile(int mobile) {
        Mobile = mobile;
    }

    public void setName(String name) {
        Name = name;
    }
}
