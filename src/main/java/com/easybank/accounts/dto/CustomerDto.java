package com.easybank.accounts.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 5,max = 30,message = "The length of customer name should be between 5 to 30 characters")
    private String name;

    @NotEmpty(message = "Email can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
