package sk.upjs.paz;


import lombok.Data;
import sk.upjs.jpaz2.Turtle;

import java.util.Set;

@Data
public class User {
    private Long id;
    private String name;
    private String chipId;
    private Set<Turtle> access;
    private boolean admin;
    private boolean active;
}
