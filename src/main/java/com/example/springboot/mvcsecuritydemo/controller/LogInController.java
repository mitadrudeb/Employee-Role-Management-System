package com.example.springboot.mvcsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogInController {
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
//         return "plain-login";
         return "fancy-login";
     }

     // add request mapping for access denied.
     @GetMapping("/accessDenied")
     public String showAccessDenied() {
//         return "plain-login";
         return "accessDenied";
     }



}
