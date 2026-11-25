package com.example.ebankservice.services;

import com.example.ebankservice.entities.BankAccount;
import com.example.ebankservice.repository.BankAccountRepository;

import java.util.List;

public class EbankService {
    private BankAccountRepository accountRepository;
    public EbankService(BankAccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    public List<BankAccount> getAllBankAccounts(){
        return accountRepository.findAll();
    }

    public BankAccount getBankAccountById() {
        return accountRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Account not found"));
    }
    public BankAccount save(BankAccount bankAccount){
        return accountRepository.save(bankAccount);
    }
}
