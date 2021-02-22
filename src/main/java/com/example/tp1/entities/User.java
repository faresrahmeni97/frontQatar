package com.example.tp1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class User implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userid")
    private Long id;
    private String email;
    private String pwd;
    private String fname;
    private String lname;

    //@ManyToMany(mappedBy="users",cascade=CascadeType.ALL,fetch = FetchType.LAZY)

    @ManyToMany(mappedBy="users",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    //@JsonManagedReference//@JsonBackReference
    private List<Project> project;
    //@JsonManagedReference//@JsonBackReference


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Role> roles;



  /*  public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }


}