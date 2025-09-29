package sk.upjs.paz;

import lombok.With;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Set;

@With
public record Prezencka(Long id,
                        LocalDateTime dateTime,
                        Predmet predmet,
                        Set<Student> students
) {
}
