package com.szjx.signgin.mobile.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SgininController {

    @PostMapping("/user/signin")
    @ResponseBody
    public String signin(){
        return "sign in success";
    }
}
