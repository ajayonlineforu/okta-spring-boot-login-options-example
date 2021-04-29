package com.okta.springsecurityauth;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class WebController {
    
    @RequestMapping("/")
    @ResponseBody
    public String index(Principal principal) {
        System.out.println("Principal is " + principal.getName());
        return "Hello Mr. " + principal.getName();
    }

}