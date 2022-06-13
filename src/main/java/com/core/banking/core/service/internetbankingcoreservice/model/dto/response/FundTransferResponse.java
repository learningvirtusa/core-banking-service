package com.core.banking.core.service.internetbankingcoreservice.model.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class FundTransferResponse {

    private String message;
    private String transactionId;

}
