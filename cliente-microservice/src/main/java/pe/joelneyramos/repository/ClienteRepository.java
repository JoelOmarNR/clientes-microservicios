package pe.joelneyramos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.joelneyramos.entity.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, Integer>{

}
