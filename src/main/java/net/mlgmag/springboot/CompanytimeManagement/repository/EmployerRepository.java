package net.mlgmag.springboot.CompanytimeManagement.repository;

import net.mlgmag.springboot.CompanytimeManagement.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployerRepository extends JpaRepository<Employer, UUID> {
}
