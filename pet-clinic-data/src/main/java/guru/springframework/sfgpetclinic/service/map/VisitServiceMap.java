package guru.springframework.sfgpetclinic.service.map;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.service.VisitService;

import java.util.Set;

public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getPetOwner() == null ||
            visit.getPet().getId() == null || visit.getPet().getPetOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit while saving");
        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
