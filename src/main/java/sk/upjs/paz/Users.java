package sk.upjs.ics;

import lombok.Data;

import java.util.Set;

@Data
public class User {
    private Long id;
    private String name;
    private String chipId;
    private Set<ChipReader> access;
    private boolean admin;
    private boolean active;
}
