package com.home.database.animals;


import com.home.management.database.animal.Animal;
import com.home.management.database.animal.AnimalType;
import com.home.management.database.animal.Care;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.time.LocalDate;
import java.util.Set;

import static org.junit.Assert.assertFalse;

public class ValidationTests {

    private Validator validator;

    @Before
    public void init(){
        validator =
                Validation.byDefaultProvider()
                        .configure()
                        .messageInterpolator(new ParameterMessageInterpolator())
                        .buildValidatorFactory()
                        .getValidator();
    }

    @Test
    public void validationAnimal(){

        Animal animal = Animal.builder()
                .name("Zack")
                .birthDate(LocalDate.of(2016, 05, 22))
                .weight(50)
                .type(AnimalType.CHIEN)
                .cares(Care.builder()
                        .date(LocalDate.of(2022, 02, 28))
                        .description("Castratation")
                       .build())
                .build();

        Set<ConstraintViolation<Animal>> violations = validator.validate(animal);
        assertFalse(!violations.isEmpty());
    }
}
