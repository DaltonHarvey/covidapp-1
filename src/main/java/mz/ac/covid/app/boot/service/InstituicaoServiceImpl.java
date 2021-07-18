package mz.ac.covid.app.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mz.ac.covid.app.boot.dao.InstituicaoDao;
import mz.ac.covid.app.boot.domain.Instituicao;

@Service
@Transactional(readOnly = false)
public class InstituicaoServiceImpl implements InstituicaoService {

	@Autowired(required = false)
	private InstituicaoDao dao;

	@Override
	public void registar(Instituicao instituicao) {
		dao.save(instituicao);

	}

	@Override
	public void editar(Instituicao instituicao) {
		dao.update(instituicao);

	}

	@Override
	public void apagar(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Instituicao pesquisarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Instituicao> pesquisarTodos() {
		return dao.findAll();
	}

}
