package net.mlgmag.springboot.CompanytimeManagement.repository;

import net.mlgmag.springboot.CompanytimeManagement.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PositionRepository extends JpaRepository<Position, UUID> {
}
