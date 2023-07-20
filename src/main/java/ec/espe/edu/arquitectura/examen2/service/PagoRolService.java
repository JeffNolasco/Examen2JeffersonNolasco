package ec.espe.edu.arquitectura.examen2.service;

import ec.espe.edu.arquitectura.examen2.controller.dto.PagoRolRQ;
import ec.espe.edu.arquitectura.examen2.model.PagoRol;
import ec.espe.edu.arquitectura.examen2.repository.EmpresaRepository;
import ec.espe.edu.arquitectura.examen2.repository.PagoRolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoRolService {
    private final PagoRolRepository pagoRolRepository;

    public PagoRolService(PagoRolRepository pagoRolRepository) {
        this.pagoRolRepository = pagoRolRepository;
    }

    public List<PagoRol> obtainPagoRolByMes(String mes) {
        return pagoRolRepository.findPagoRolByMes(mes);
    }

    public PagoRol transformPagoRolRQ(PagoRolRQ rq){
        PagoRol pagoRol = PagoRol
                .builder()
                .id(rq.getId())
                .mes(rq.getMes())
                .rucEmpresa(rq.getRucEmpresa())
                .cuentaPrincipal(rq.getCuentaPrincipal())
                .empleadoPagos(rq.getEmpleadoPagos())
                .build();
        return pagoRol;
    }

}
