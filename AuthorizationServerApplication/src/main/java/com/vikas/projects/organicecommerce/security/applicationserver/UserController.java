package com.vikas.projects.organicecommerce.security.applicationserver;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }
}
