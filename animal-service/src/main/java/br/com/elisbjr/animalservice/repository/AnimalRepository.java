package br.com.elisbjr.animalservice.repository;

import br.com.elisbjr.animalservice.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    @Query("SELECT a FROM Animal a WHERE a.exitDate IS NULL ORDER BY a.enterDate")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.exitDate IS NOT NULL ORDER")
    List<Animal> findAdopted();
}
