package com.MODEL;

public class Doctor {
    private  int id;
    private String name;
    private String email;
    private String password;
    private String speciality;

    //constructor with ID
    public Doctor( int id , String name, String email, String password, String speciality) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.speciality = speciality;
        this.id = id;
    }

    //constructor without ID
    public Doctor(String name, String email, String password, String speciality) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + speciality + '\'' +
                '}';
    }
}
