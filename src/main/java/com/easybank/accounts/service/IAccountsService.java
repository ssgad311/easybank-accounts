package com.easybank.accounts.service;

import com.easybank.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - customer dto obejcet
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - input mobile number
     * @return Account details based on mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto - input customer dto object
     * @return boolean value as account updated or not
     */
    Boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - input mobile number
     * @return boolean value as account deleted or not
     */
    Boolean deleteAccount(String mobileNumber);
}
