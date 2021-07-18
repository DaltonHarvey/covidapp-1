package mz.ac.covid.app.boot.dao;

import java.util.List;

import mz.ac.covid.app.boot.domain.Instituicao;

public interface InstituicaoDao {

	void save(Instituicao instituicao);

	void update(Instituicao instituicao);

	void delete(Long id);

	Instituicao findById(Long id);

	List<Instituicao> findAll();
}
