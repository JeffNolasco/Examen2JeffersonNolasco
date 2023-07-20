package ec.espe.edu.arquitectura.examen2.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Builder
@Document(collection = "pagos_rol")
public class PagoRol {
    @Id
    private String id;
    private String mes;
    private Date fechaProceso;
    private String rucEmpresa;
    private String cuentaPrincipal;
    private Number valorTotal;
    private Number valorReal;
    private List<EmpleadoPago> empleadoPagos;
}
