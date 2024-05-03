package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class helloController {

    // handles request at path /hello
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello, Spring!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye, Spring!";
    }

}

