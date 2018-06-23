package net.mlgmag.springboot.CompanytimeManagement.service;

import net.mlgmag.springboot.CompanytimeManagement.definition.DepartmentService;
import net.mlgmag.springboot.CompanytimeManagement.model.Department;
import net.mlgmag.springboot.CompanytimeManagement.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void update(Department department) {
        departmentRepository.saveAndFlush(department);
    }

    @Override
    public void delete(Department department) {
        departmentRepository.delete(department);
    }

    @Override
    public Optional<Department> findById(UUID uuid) {
        return departmentRepository.findById(uuid);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

}
