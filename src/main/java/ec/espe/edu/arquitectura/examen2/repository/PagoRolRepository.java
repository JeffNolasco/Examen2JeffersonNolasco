package ec.espe.edu.arquitectura.examen2.repository;

import ec.espe.edu.arquitectura.examen2.model.Empresa;
import ec.espe.edu.arquitectura.examen2.model.PagoRol;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PagoRolRepository extends MongoRepository<PagoRol, String> {
    List<PagoRol> findPagoRolByMes(String mes);
}
