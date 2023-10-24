package com.easybank.accounts.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Account number must be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "Account type can not be a null or empty")
    private String accountType;

    @NotEmpty(message = "Branch Address can not be a null or empty")
    private String branchAddress;
}
