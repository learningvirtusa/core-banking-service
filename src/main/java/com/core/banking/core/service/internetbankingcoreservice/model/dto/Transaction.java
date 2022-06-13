package com.core.banking.core.service.internetbankingcoreservice.model.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Transaction {

    private Long id;
    private BigDecimal amount;
    private BankAccount bankAccount;
    private String referenceNumber;

}
