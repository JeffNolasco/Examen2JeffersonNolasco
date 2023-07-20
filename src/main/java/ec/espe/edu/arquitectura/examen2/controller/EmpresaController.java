package ec.espe.edu.arquitectura.examen2.controller;

import ec.espe.edu.arquitectura.examen2.controller.dto.EmpresaRQ;
import ec.espe.edu.arquitectura.examen2.model.Empresa;
import ec.espe.edu.arquitectura.examen2.service.EmpresaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/empresa")
public class EmpresaController {

    private final EmpresaService service;

    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity createEmpresa(@RequestBody EmpresaRQ empresaRQ) {
        this.service.createEmpresa(empresaRQ);
        return ResponseEntity.ok().build();
    }
}
