package pe.joelneyramos.service;

import pe.joelneyramos.entity.Colaborador;

import java.util.Collection;

public interface ColaboradorService {

    public abstract void insert (Colaborador colaborador);
    public abstract void update (Colaborador colaborador);
    public abstract void delete (Integer colaboradorId);
    public abstract Colaborador findById(Integer colaboradorId);
    public abstract Collection<Colaborador> findAll();

}
