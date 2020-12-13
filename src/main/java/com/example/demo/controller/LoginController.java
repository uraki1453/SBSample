package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    //ログイン画面への遷移
    @GetMapping
    String getLogin() {
        return "login";
    }

    //ログイン成功時のメニュー画面への遷移
    @PostMapping
    String postLogin() {
        return "redirect:/menu";
    }
}
