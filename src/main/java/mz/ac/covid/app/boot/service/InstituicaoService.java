package mz.ac.covid.app.boot.service;

import java.util.List;

import mz.ac.covid.app.boot.domain.Instituicao;

public interface InstituicaoService {

	void registar(Instituicao cargo);

	void editar(Instituicao cargo);

	void apagar(Long id);

	Instituicao pesquisarPorId(Long id);

	List<Instituicao> pesquisarTodos();

}
