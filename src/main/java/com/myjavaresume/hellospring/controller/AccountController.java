package com.myjavaresume.hellospring.controller;

import com.myjavaresume.hellospring.dto.AccountRequestDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AccountController {

    @GetMapping("/hello")
    public String helloSpring(){
        return "Hello Spring!";

    }

    @PostMapping("/accounts")
    public Long createAccount(@RequestBody AccountRequestDTO accountRequestDTO) {


    }
}
