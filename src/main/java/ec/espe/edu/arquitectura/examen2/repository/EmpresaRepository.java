package ec.espe.edu.arquitectura.examen2.repository;

import ec.espe.edu.arquitectura.examen2.model.Empresa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpresaRepository extends MongoRepository<Empresa, String> {
    Empresa findByRuc(String ruc);
}
