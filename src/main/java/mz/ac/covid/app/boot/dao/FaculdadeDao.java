package mz.ac.covid.app.boot.dao;

import java.util.List;

import mz.ac.covid.app.boot.domain.Faculdade;

public interface FaculdadeDao {

	void save(Faculdade faculdade);

	void updade(Faculdade faculdade);

	void delete(Long id);

	Faculdade findById(Long id);

	List<Faculdade> findAll();

}
