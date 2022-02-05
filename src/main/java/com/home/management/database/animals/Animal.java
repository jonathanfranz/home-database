package com.home.management.database.animals;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class Animal {
    String name;
    LocalDate birthDay;
    AnimalType type;
    double weight;
    List<Vaccine> vaccineList;
    List<Care> careList;
}
