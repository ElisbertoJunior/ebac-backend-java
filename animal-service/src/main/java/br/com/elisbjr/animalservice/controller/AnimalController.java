package br.com.elisbjr.animalservice.controller;

import br.com.elisbjr.animalservice.entity.Animal;
import br.com.elisbjr.animalservice.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalRepository repository;

    @GetMapping
    private ResponseEntity<List<Animal>> findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @PostMapping
    private ResponseEntity<Animal> create(@RequestBody Animal animal) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(animal));
    }
}
