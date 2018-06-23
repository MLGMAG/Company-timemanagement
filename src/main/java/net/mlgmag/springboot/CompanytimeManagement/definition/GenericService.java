package net.mlgmag.springboot.CompanytimeManagement.definition;

import java.util.List;
import java.util.Optional;

public interface GenericService<T, ID> {

    void save(T t);

    void update(T t);

    void delete(T t);

    Optional<T> findById(ID id);

    List<T> findAll();

}
