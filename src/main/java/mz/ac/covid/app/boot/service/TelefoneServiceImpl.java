package mz.ac.covid.app.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mz.ac.covid.app.boot.dao.TelefoneDao;
import mz.ac.covid.app.boot.domain.Telefone;

@Service
@Transactional(readOnly = false)
public class TelefoneServiceImpl implements TelefoneService {

	@Autowired(required = false)
	private TelefoneDao dao;

	@Override
	public void salvar(Telefone telefone) {
		dao.save(telefone);
	}

	@Override
	public void editar(Telefone telefone) {
		dao.update(telefone);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Telefone buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Telefone> buscarTodos() {
		return dao.findAll();
	}

}
