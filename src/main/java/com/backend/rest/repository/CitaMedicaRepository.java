package com.backend.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.rest.entity.CitaDisponible;

public interface CitaMedicaRepository extends JpaRepository<CitaDisponible, Integer>{

}
