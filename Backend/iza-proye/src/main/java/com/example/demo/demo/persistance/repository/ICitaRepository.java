package com.example.demo.demo.persistance.repository;

import com.example.demo.demo.persistance.entities.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICitaRepository extends JpaRepository<Cita, Long> {
}
