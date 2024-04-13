package com.example.pafbackend.services;

import com.example.pafbackend.models.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(Account account) throws Exception;
    List<Account> searchCustomAccount(String startDate, String endDate);
}
