package mz.ac.covid.app.boot.service;

import java.util.List;

import mz.ac.covid.app.boot.domain.NivelAcademico;

public interface NivelAcademicoService {

	void salvar(NivelAcademico nivelAcademico);

	void editar(NivelAcademico nivelAcademico);

	void excluir(Long id);

	NivelAcademico buscarPorId(Long id);

	List<NivelAcademico> buscarTodos();
}
