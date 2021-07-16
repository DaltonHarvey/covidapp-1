package mz.ac.covid.app.boot.dao;

import org.springframework.stereotype.Repository;

import mz.ac.covid.app.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
