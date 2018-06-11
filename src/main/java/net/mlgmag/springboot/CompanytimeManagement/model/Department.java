package net.mlgmag.springboot.CompanytimeManagement.model;

import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
public class Department {

    private UUID id;
    private String name;
    private Set<Employer> employers;

}
