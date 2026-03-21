package com.grupoemy.yazir_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoemy.yazir_api.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmail(String email);

    // Spring Data JPA genera automáticamente la implementac
    // de estos métodos basándose en el nombre del método
    List<Student> findByFirstNameContainingIgnoreCase(String firstName);

    List<Student> findByLastNameContainingIgnoreCase(String lastName);

    boolean existsByEmail(String email);
}
