package com.pacientes.historial.infraestructure;

import com.pacientes.historial.domain.Model.Entity.PacienteEntity;
import com.pacientes.historial.domain.Service.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<PacienteEntity> crearPaciente(@RequestBody PacienteEntity paciente) {
        PacienteEntity nuevo = pacienteService.crearPaciente(paciente);
        return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
    }
}