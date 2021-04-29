package com.danwhat.projeto.controller;

import com.danwhat.projeto.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Data
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/test")
        public String teste() {
        return "testado";
    }
}
