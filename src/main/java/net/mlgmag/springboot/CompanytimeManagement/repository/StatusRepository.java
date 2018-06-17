package net.mlgmag.springboot.CompanytimeManagement.repository;

import net.mlgmag.springboot.CompanytimeManagement.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StatusRepository extends JpaRepository<Status, UUID> {
}
