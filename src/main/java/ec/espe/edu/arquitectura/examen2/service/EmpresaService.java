package ec.espe.edu.arquitectura.examen2.service;

import ec.espe.edu.arquitectura.examen2.controller.dto.EmpresaRQ;
import ec.espe.edu.arquitectura.examen2.model.Empresa;
import ec.espe.edu.arquitectura.examen2.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public void createEmpresa(EmpresaRQ empresaRQ) {
        try {
            Empresa empresa = this.transformEmpresaRQ(empresaRQ);
            Empresa newEmpresa = this.empresaRepository.findByRuc(empresa.getRuc());
            if(newEmpresa == null) {
                this.empresaRepository.save(empresa);
            }
        }catch (RuntimeException rte){
            throw new RuntimeException("Company can't be created: ", rte);
        }

    }

    public Empresa transformEmpresaRQ(EmpresaRQ rq){
        Empresa empresa = Empresa.builder()
                .id(rq.getId())
                .ruc(rq.getRuc())
                .razonSocial(rq.getRazonSocial())
                .cuentaPrincipal(rq.getCuentaPrincipal())
                .empleados(rq.getEmpleados())
                .build();
        return empresa;
    }
}
