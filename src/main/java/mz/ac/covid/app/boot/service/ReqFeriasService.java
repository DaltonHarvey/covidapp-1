package mz.ac.covid.app.boot.service;

import java.util.List;

import mz.ac.covid.app.boot.domain.ReqFerias;

public interface ReqFeriasService {

	void salvar(ReqFerias reqFerias);

	void editar(ReqFerias reqFerias);

	void excluir(Long id);

	ReqFerias buscarPorId(Long id);

	List<ReqFerias> buscarTodos();
}
