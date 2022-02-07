package com.home.management.database.animal;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Data
@Builder
public class Vaccine {
    String name;
    @PastOrPresent
    LocalDate date;
}
