package com.webcontrolone.webcontrol.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
    @RequestMapping("/loginp")
    public String openPage() {
        return "login";
    }
}
