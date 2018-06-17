package net.mlgmag.springboot.CompanytimeManagement.repository;

import net.mlgmag.springboot.CompanytimeManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
