package com.home.management.database.user;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Data
@Builder
public class User {
    @NotEmpty
    String firstName;
    @NotEmpty
    String lastName;
    LocalDate dateOfBirth;
    @Email
    String email;
    @NotEmpty
    @Digits(integer = 4, fraction = 0)
    String pinCode;

}
