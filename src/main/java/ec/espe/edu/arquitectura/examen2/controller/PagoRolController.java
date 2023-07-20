package ec.espe.edu.arquitectura.examen2.controller;

import ec.espe.edu.arquitectura.examen2.service.EmpresaService;
import ec.espe.edu.arquitectura.examen2.service.PagoRolService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pagoRol")
public class PagoRolController {
    private final PagoRolService service;

    public PagoRolController(PagoRolService service) {
        this.service = service;
    }
    

}
