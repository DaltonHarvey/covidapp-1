package mz.ac.covid.app.boot.dao;

import java.util.List;

import mz.ac.covid.app.boot.domain.Telefone;

public interface TelefoneDao {

	void save(Telefone telefone);

	void update(Telefone telefone);

	void delete(Long id);

	Telefone findById(Long id);

	List<Telefone> findAll();
}
