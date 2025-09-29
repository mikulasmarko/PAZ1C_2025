package sk.upjs.paz;

import lombok.With;

import java.util.Set;

@With
public record Predmet(Long id,
                      String name,
                      int yearOfStudies,
                      Set<Student> students) {
}
