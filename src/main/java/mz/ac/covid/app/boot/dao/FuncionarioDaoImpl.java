package mz.ac.covid.app.boot.dao;

import org.springframework.stereotype.Repository;

import mz.ac.covid.app.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
