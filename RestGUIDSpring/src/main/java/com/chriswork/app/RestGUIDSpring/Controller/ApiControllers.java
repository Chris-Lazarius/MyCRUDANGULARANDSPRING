package com.chriswork.app.RestGUIDSpring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chriswork.app.RestGUIDSpring.Model.Student;
import com.chriswork.app.RestGUIDSpring.Repo.StudentRepo;
import java.util.*;


@RestController
public class ApiControllers {

    @Autowired
    private StudentRepo student_repo;

    @GetMapping(value = "/")
    public String getPage()
    {
        return "Welcome Mr Chris";
    }

    //This methode will return all users
    @GetMapping(value = "/students")
    public List<Student> getStudents()
    {
        return student_repo.findAll();
    }

    //This method will save/store new student within the student table, we mde use of the POST function.
    // We are passing the student entity as a parameter.

    @PostMapping(value = "/savestudent")
    public String saveStudent(@RequestBody Student student)
    {
        student_repo.save(student);
        return "Saved...";
    }

}