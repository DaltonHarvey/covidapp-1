package mz.ac.covid.app.boot.service;

import java.util.List;

import mz.ac.covid.app.boot.domain.Funcionario;

public interface FuncionarioService {

	void registar(Funcionario funcionario);

	void editar(Funcionario funcionario);

	void apagar(Long id);

	Funcionario pesquisarPorId(Long id);

	List<Funcionario> pesquisarTodos();

	boolean funcionariosTemCargo(Long id);
}
