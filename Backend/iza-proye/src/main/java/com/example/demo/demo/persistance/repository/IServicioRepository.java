package com.example.demo.demo.persistance.repository;
import com.example.demo.demo.persistance.entities.Servivio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServicioRepository extends JpaRepository<Servivio, Long> {
}
