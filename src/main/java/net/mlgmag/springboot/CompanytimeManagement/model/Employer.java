package net.mlgmag.springboot.CompanytimeManagement.model;

import lombok.Data;
import net.mlgmag.springboot.CompanytimeManagement.enums.Authority;
import net.mlgmag.springboot.CompanytimeManagement.enums.Position;
import net.mlgmag.springboot.CompanytimeManagement.enums.Status;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Data
public class Employer {

    private UUID id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Set<Authority> authorities;
    private Position position;
    private Department department;
    private Status status;
    private BigDecimal hourlyRate;

}
