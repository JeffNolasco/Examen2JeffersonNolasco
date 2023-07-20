package ec.espe.edu.arquitectura.examen2.controller.dto;

import ec.espe.edu.arquitectura.examen2.model.Empleado;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EmpresaRS {

    private String ruc;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<Empleado> empleados;
}
