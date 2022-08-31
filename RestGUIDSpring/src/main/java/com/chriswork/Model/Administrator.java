package com.chriswork.Model;

public class Administrator {

    private long admin_id;
    private String admin_name;
    private String admin_contact;
    private String admin_password;
    
    public long getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(long admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_contact() {
        return admin_contact;
    }

    public void setAdmin_contact(String admin_contact) {
        this.admin_contact = admin_contact;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public Administrator() {
        super();
    }
    
}
