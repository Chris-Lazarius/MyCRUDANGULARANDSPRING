package com.chriswork.app.RestGUIDSpring.Model;

import javax.persistence.*;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String sFName;
    @Column
    private String sLName;
    @Column
    private String sAddress;
    @Column
    private String sEmail;
    @Column
    private String sPassword;

    

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getsFName() {
        return sFName;
    }
    public void setsFName(String sFName) {
        this.sFName = sFName;
    }
    public String getsLName() {
        return sLName;
    }
    public void setsLName(String sLName) {
        this.sLName = sLName;
    }
    public String getsAddress() {
        return sAddress;
    }
    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }
    public String getsEmail() {
        return sEmail;
    }
    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }
    public String getsPassword() {
        return sPassword;
    }
    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }
    
    public Student() {
        super();
    }

}
