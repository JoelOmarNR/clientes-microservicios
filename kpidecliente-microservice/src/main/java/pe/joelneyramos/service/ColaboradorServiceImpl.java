package pe.joelneyramos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.joelneyramos.entity.Colaborador;
import pe.joelneyramos.repository.ColaboradorRepository;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
public class ColaboradorServiceImpl implements ColaboradorService
{
    @Autowired
    private ColaboradorRepository colaboradorRepository;



    @Override
    @Transactional
    public void insert(Colaborador colaborador) {
        colaboradorRepository.save(colaborador);
    }

    @Override
    @Transactional
    public void update(Colaborador colaborador) {
        colaboradorRepository.save(colaborador);
    }

    @Override
    @Transactional
    public void delete(Integer colaboradorId) {
        colaboradorRepository.deleteById(colaboradorId);
    }

    @Override
    @Transactional
    public Colaborador findById(Integer colaboradorId) {
        return colaboradorRepository.findById(colaboradorId).orElse(null);
    }

    @Override
    @Transactional
    public Collection<Colaborador> findAll() {
        return colaboradorRepository.findAll();
    }
}

