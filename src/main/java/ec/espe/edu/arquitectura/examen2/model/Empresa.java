package ec.espe.edu.arquitectura.examen2.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "empresas")
public class Empresa {
    @Id
    private String id;
    private String ruc;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<Empleado> empleados;
}
