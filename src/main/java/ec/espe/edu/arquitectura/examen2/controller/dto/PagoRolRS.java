package ec.espe.edu.arquitectura.examen2.controller.dto;

import ec.espe.edu.arquitectura.examen2.model.EmpleadoPago;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
@Builder
public class PagoRolRS {
    private String id;
    private String mes;
    private Date fechaProceso;
    private String rucEmpresa;
    private List<EmpleadoPago> empleadoPagos;
}
