package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
    Set<Specialty> findAll();
}
