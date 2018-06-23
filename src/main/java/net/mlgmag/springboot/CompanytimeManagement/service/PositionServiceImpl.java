package net.mlgmag.springboot.CompanytimeManagement.service;

import net.mlgmag.springboot.CompanytimeManagement.definition.PositionService;
import net.mlgmag.springboot.CompanytimeManagement.model.Position;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PositionServiceImpl implements PositionService {

    @Override
    public void save(Position position) {

    }

    @Override
    public void update(Position position) {

    }

    @Override
    public void delete(Position position) {

    }

    @Override
    public Optional<Position> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public List<Position> findAll() {
        return null;
    }

}
