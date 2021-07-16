package mz.ac.covid.app.boot.service;

import java.util.List;

import mz.ac.covid.app.boot.domain.Autorizacao;

public interface AutorizacaoService {

	void registar(Autorizacao autorizacao);

	void editar(Autorizacao autorizacao);

	void apagar(Long id);

	Autorizacao pesquisarPorId(Long id);

	List<Autorizacao> pesquisarTodos();

}
