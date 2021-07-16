package mz.ac.covid.app.boot.dao;

import java.util.List;

import mz.ac.covid.app.boot.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);

	void update(Funcionario funcionario);

	void delete(Long id);

	Funcionario findById(Long id);

	List<Funcionario> findAll();
}
