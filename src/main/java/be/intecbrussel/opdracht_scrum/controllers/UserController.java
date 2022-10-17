package be.intecbrussel.opdracht_scrum.controllers;

import be.intecbrussel.opdracht_scrum.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private AccountService userService;
}
