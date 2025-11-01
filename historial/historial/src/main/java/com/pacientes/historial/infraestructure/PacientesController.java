package com.pacientes.historial.infraestructure;

import com.pacientes.historial.domain.Model.Entity.PacienteEntity;
import com.pacientes.historial.domain.Service.PacienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/historial")

public class PacientesController {
    private final PacienteService pacienteService;

    public PacientesController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public List<PacienteEntity> listarPacientes() {
        return pacienteService.listarPacientes();
    }
}