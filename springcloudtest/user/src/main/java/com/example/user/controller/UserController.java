package com.example.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by youjy on 2022-10-31.
 */
@Controller
public class UserController {
    @RequestMapping(value="/test")
    @ResponseBody
    public String test(){
        return "testSpringcloud";
    }
}
