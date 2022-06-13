package com.core.banking.core.service.internetbankingcoreservice.controller;

import com.core.banking.core.service.internetbankingcoreservice.model.dto.request.DepositRequest;
import com.core.banking.core.service.internetbankingcoreservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/bank-account/{account_number}")
    public ResponseEntity getBankAccount(@PathVariable("account_number") String accountNumber) {
        log.info("Reading account by ID {}", accountNumber);
        return ResponseEntity.ok(accountService.readBankAccount(accountNumber));
    }

    @GetMapping("/util-account/{account_name}")
    public ResponseEntity getUtilityAccount(@PathVariable("account_name") String providerName) {
        log.info("Reading utitlity account by ID {}", providerName);
        return ResponseEntity.ok(accountService.readUtilityAccount(providerName));
    }
}
