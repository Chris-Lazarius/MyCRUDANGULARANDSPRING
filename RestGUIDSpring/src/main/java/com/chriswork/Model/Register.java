package com.chriswork.Model;

import javax.persistence.*;

@Entity
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long register_id;
    @Column
    private String course_name;
    @Column
    private String strudent_name;
    @Column
    private String student_address;
    @Column
    private String student_email;
    @Column
    private String student_password;

    public Register() {
        super();
    }
    
}
