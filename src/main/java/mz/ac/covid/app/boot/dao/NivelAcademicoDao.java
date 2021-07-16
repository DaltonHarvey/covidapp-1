package mz.ac.covid.app.boot.dao;

import java.util.List;

import mz.ac.covid.app.boot.domain.NivelAcademico;

public interface NivelAcademicoDao {

	void save(NivelAcademico nivelAcademico);

	void update(NivelAcademico nivelAcademico);

	void delete(Long id);

	NivelAcademico findById(Long id);

	List<NivelAcademico> findAll();
}
