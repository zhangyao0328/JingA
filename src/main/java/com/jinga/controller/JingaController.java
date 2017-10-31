package com.jinga.controller;

import com.jinga.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/kfc")
public class JingaController {

    @RequestMapping(value = "toSpring/{name}/{age}", method = RequestMethod.GET)
    public @ResponseBody Student toSpring(@PathVariable String name, @PathVariable Integer age){

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        return student;
    }

}
