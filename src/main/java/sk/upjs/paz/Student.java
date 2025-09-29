package sk.upjs.paz;

import lombok.With;

import java.time.LocalDate;
import java.util.Date;

@With
public record Student(
        Long id,
        String firstName,
        String lastName,
        Enum gender,
        LocalDate dateOfBirth ){

    public enum Gender {
        MALE, FEMALE, MUTANT;
    }


}
