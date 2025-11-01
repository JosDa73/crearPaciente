package com.pacientes.historial.domain.Repository;

import com.pacientes.historial.domain.Model.Entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PacientesRepository extends JpaRepository<PacienteEntity, Integer> {

}