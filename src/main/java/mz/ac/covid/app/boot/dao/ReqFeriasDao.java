package mz.ac.covid.app.boot.dao;

import java.util.List;

import mz.ac.covid.app.boot.domain.ReqFerias;

public interface ReqFeriasDao {

	void save(ReqFerias reqFerias);

	void update(ReqFerias reqFerias);

	void delete(Long id);

	ReqFerias findbyId(Long id);

	List<ReqFerias> findAll();
}
