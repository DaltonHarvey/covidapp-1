package mz.ac.covid.app.boot.dao;

import java.util.List;

import mz.ac.covid.app.boot.domain.Tipo;

public interface TipoDao {

	void save(Tipo tipo);

	void update(Tipo tipo);

	void delete(Long id);

	Tipo findById(Long id);

	List<Tipo> findAll();

}
