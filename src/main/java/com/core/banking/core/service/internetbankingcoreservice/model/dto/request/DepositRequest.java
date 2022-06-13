package com.core.banking.core.service.internetbankingcoreservice.model.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DepositRequest {
    private String accountNumber;
    private BigDecimal amount;
}
