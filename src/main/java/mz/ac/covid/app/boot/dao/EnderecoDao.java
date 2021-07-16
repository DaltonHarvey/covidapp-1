package mz.ac.covid.app.boot.dao;

import java.util.List;

import mz.ac.covid.app.boot.domain.Endereco;

public interface EnderecoDao {

	void save(Endereco endereco);

	void update(Endereco endereco);

	void delete(Long id);

	Endereco findbyId(Long id);

	List<Endereco> findAll();
}
