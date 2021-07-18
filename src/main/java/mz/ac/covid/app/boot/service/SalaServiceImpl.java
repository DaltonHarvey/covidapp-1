package mz.ac.covid.app.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mz.ac.covid.app.boot.dao.SalaDao;
import mz.ac.covid.app.boot.domain.Sala;

@Service
@Transactional(readOnly = false)
public class SalaServiceImpl implements SalaService {

    @Autowired
    private SalaDao dao;

    @Override
    public void salvar(Sala sala) {
        dao.save(sala);

    }

    @Override
    public void editar(Sala sala) {
        dao.update(sala);
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);

    }

    @Override
    public Sala buscarPorId(Long id) {

        return dao.findById(id);
    }

    @Override
    public List<Sala> buscarTodos() {

        return dao.findAll();
    }

}
