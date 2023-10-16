package com.easybank.accounts.service;

import com.easybank.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - customer dto obejcet
     */
    void createAccount(CustomerDto customerDto);
}
