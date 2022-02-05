package com.home.management.database.animals;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Data
@Builder
public class Care {
    @NotEmpty
    String description;
    @NotNull
    @PastOrPresent
    LocalDate date;
    Double price;
}
