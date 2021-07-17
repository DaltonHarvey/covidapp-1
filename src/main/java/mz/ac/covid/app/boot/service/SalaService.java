package mz.ac.covid.app.boot.service;

import java.util.List;

import mz.ac.covid.app.boot.domain.Sala;

public interface SalaService {

    void salvar(Sala sala);

    void editar(Sala sala);

    void excluir(Long id);

    Sala buscarPorId(Long id);

    List<Sala> buscarTodos();
}
