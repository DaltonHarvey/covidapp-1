package mz.ac.covid.app.boot.service;

import java.util.List;

import mz.ac.covid.app.boot.domain.Endereco;

public interface EnderecoService {

	void salvar(Endereco endereco);

	void editar(Endereco endereco);

	void excluir(Long id);

	Endereco buscarPorId(Long id);

	List<Endereco> buscarTodos();
}
