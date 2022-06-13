package com.core.banking.core.service.internetbankingcoreservice.model.dto;

import com.core.banking.core.service.internetbankingcoreservice.model.AccountStatus;
import com.core.banking.core.service.internetbankingcoreservice.model.AccountType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class BankAccount {

    private Long id;
    private String number;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;

}
