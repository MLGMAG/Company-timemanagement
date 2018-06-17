package net.mlgmag.springboot.CompanytimeManagement.repository;

import net.mlgmag.springboot.CompanytimeManagement.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorityRepository extends JpaRepository<Authority, UUID> {
}
