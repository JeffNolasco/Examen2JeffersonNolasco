package ec.espe.edu.arquitectura.examen2.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpleadoPago {
    private String numeroCuenta;
    private String valor;
    private String estado;
}
