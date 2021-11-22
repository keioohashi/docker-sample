package com.example.account.controller;

import com.example.account.entity.Account;
import com.example.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.io.*;
import java.net.*;

@RestController()
@RequestMapping(value = "/account")
@RequiredArgsConstructor
class AccountController {

    @Autowired
    private final AccountRepository accountRepository;

    @GetMapping("")
    public Flux<Account> all(){
        return this.accountRepository.findAll();
    }
}