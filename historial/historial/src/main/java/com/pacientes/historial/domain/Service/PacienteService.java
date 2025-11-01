package com.pacientes.historial.domain.Service;

import com.pacientes.historial.domain.Model.Entity.PacienteEntity;
import com.pacientes.historial.domain.Repository.PacientesRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PacienteService {
    private  final  PacientesRepository pacientesRepository;

    public PacienteService(PacientesRepository pacientesRepository) {
        this.pacientesRepository = pacientesRepository;
    }

    public List<PacienteEntity> listarPacientes() {
        return pacientesRepository.findAll();
    }
}