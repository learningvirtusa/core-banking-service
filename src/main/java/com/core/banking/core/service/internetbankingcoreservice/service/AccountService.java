package com.core.banking.core.service.internetbankingcoreservice.service;

import com.core.banking.core.service.internetbankingcoreservice.model.dto.BankAccount;
import com.core.banking.core.service.internetbankingcoreservice.model.dto.UtilityAccount;
import com.core.banking.core.service.internetbankingcoreservice.model.entity.BankAccountEntity;
import com.core.banking.core.service.internetbankingcoreservice.model.entity.UtilityAccountEntity;
import com.core.banking.core.service.internetbankingcoreservice.model.mapper.BankAccountMapper;
import com.core.banking.core.service.internetbankingcoreservice.model.mapper.UtilityAccountMapper;
import com.core.banking.core.service.internetbankingcoreservice.repository.BankAccountRepository;
import com.core.banking.core.service.internetbankingcoreservice.repository.UtilityAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private BankAccountMapper bankAccountMapper = new BankAccountMapper();
    private UtilityAccountMapper utilityAccountMapper = new UtilityAccountMapper();

    private final BankAccountRepository bankAccountRepository;
    private final UtilityAccountRepository utilityAccountRepository;

    public BankAccount readBankAccount(String accountNumber) {
        BankAccountEntity entity = bankAccountRepository.findByNumber(accountNumber).get();
        return bankAccountMapper.convertToDto(entity);
    }

    public UtilityAccount readUtilityAccount(String provider) {
        UtilityAccountEntity utilityAccountEntity = utilityAccountRepository.findByProviderName(provider).get();
        return utilityAccountMapper.convertToDto(utilityAccountEntity);
    }

    public UtilityAccount readUtilityAccount(Long id) {
        return utilityAccountMapper.convertToDto(utilityAccountRepository.findById(id).get());
    }

}
