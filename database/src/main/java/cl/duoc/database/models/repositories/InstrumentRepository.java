package cl.duoc.database.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.duoc.database.models.entities.InstrumentEntity;

public interface InstrumentRepository extends JpaRepository<InstrumentEntity, Integer> {
    
    @Query(value = "SELECT * FROM instrumentos WHERE categoria = :category", nativeQuery = true)
    public List<InstrumentEntity> getInstrumentByCategory(String category);
}
