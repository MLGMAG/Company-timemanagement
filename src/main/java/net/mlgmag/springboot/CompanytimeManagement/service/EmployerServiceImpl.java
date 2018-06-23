package net.mlgmag.springboot.CompanytimeManagement.service;

import net.mlgmag.springboot.CompanytimeManagement.definition.EmployerService;
import net.mlgmag.springboot.CompanytimeManagement.model.Employer;
import net.mlgmag.springboot.CompanytimeManagement.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployerServiceImpl implements EmployerService {

    private final EmployerRepository employerRepository;

    @Autowired
    public EmployerServiceImpl(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    @Override
    public void save(Employer employer) {
        employerRepository.save(employer);
    }

    @Override
    public void update(Employer employer) {
        employerRepository.saveAndFlush(employer);
    }

    @Override
    public void delete(Employer employer) {
        employerRepository.delete(employer);
    }

    @Override
    public Optional<Employer> findById(UUID uuid) {
        return employerRepository.findById(uuid);
    }

    @Override
    public List<Employer> findAll() {
        return employerRepository.findAll();
    }

}
