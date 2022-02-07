package com.home.management.database.animals;


import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class Animal {
    @NotNull
    Long id;
    @NotEmpty 
    String name;
    @NotNull
    LocalDate birthDate;
    @NotNull
    AnimalType type;
    @Positive
    double weight;
    @Singular("vaccines")
    List<Vaccine> vaccineList;
    @Singular("cares")
    List<Care> careList;
}
