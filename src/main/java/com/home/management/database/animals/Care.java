package com.home.management.database.animals;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Care {
    String description;
    LocalDate date;
    Double price;
}
