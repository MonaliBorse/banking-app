package net.javaguides.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


//auto generate constructor getter setter
@Data
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;
}
