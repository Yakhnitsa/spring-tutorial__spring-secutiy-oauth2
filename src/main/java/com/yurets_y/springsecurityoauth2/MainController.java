package com.yurets_y.springsecurityoauth2;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {
    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
